package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.a288.A288212;

/**
 * A152466 a(1) = 252, a(n) is a(n-1) multiplied by the smallest prime factor of a(n-1)+1.
 * @author Sean A. Irvine
 */
public class A152466 extends A288212 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(252);
    } else {
      mA = mA.multiply(lpf(mA.add(1)));
    }
    return mA;
  }
}
