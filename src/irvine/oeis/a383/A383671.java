package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383671 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A383671 extends Sequence0 {

  private String mA = "0";
  private String mB = "12";
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= mA.length()) {
      final String t = mA + mB;
      mA = mB;
      mB = t;
      final String u = mA + mB;
      mA = mB;
      mB = u;
    }
    return Z.valueOf(mA.charAt(mN) - '0');
  }
}

