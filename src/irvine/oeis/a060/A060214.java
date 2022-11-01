package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A060214 Successive digits of the Lucas sequence.
 * @author Sean A. Irvine
 */
public class A060214 extends A000032 {

  private String mA = "";
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN >= mA.length()) {
      mA = super.next().toString();
      mN = 0;
    }
    return Z.valueOf(mA.charAt(mN) - '0');
  }
}

