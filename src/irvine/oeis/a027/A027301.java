package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a008.A008315;

/**
 * A027301 a(n) = self-convolution of row n of Catalan triangle (A008315).
 * @author Sean A. Irvine
 */
public class A027301 extends A008315 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, mN / 2 - k)));
    }
    return sum;
  }
}
