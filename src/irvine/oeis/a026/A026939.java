package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026939 Self-convolution of array T given by A026300.
 * @author Sean A. Irvine
 */
public class A026939 extends A026300 {

  private long mN = -1;

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
