package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A065030 Numbers k such that the period of the continued fraction for sqrt(5)*k is 2.
 * @author Sean A. Irvine
 */
public class A065030 extends A003285 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (period(Z.FIVE.multiply(++mN * mN)).equals(Z.TWO)) {
        return Z.valueOf(mN);
      }
    }
  }
}
