package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026986 Self-convolution of array T given by A026681.
 * @author Sean A. Irvine
 */
public class A026986 extends A026681 {

  /** Construct the sequence. */
  public A026986() {
    super(0);
  }

  private long mN = -1;

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
