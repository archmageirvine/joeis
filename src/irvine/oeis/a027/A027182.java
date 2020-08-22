package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027182 a(n) = self-convolution of row n of array T given by A027170.
 * @author Sean A. Irvine
 */
public class A027182 extends A027170 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, mN - k)));
    }
    return sum;
  }
}
