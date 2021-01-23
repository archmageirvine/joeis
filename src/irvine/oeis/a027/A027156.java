package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027156 a(n) = self-convolution of array T given by A027144.
 * @author Sean A. Irvine
 */
public class A027156 extends A027144 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k)));
    }
    return sum;
  }
}
