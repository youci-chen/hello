package tw.edu.pu.csim.s1081648.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestMaster()
    }

    fun TestMaster(){
        var txv: TextView = findViewById<TextView>(R.id.txv)
        txv.text = "分支"
        txv.text = "dev分支"
    }

}