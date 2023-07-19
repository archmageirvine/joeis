package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027169 a(n) = self-convolution of row n of array T given by A027157.
 * @author Sean A. Irvine
 */
public class A027169 extends A027157 {

  /** Construct the sequence. */
  public A027169() {
    super(0);
  }

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
