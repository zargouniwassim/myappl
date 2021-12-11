package tn.wassim.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4Map extends AppCompatActivity {
    private Button Maps_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4_map);
        Maps_btn =findViewById(R.id.maps);
        Maps_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925.,19.0513"));
                Intent chooser = Intent.createChooser(intent, "Lauch maps");
                startActivity(chooser);

            }
        });
    }
}