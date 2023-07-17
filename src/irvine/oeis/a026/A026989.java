package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026989 a(n) = Sum_{k=0..n-3} T(n,k) * T(n,k+3), with T given by A026681.
 * @author Sean A. Irvine
 */
public class A026989 extends A026681 {

  /** Construct the sequence. */
  public A026989() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k - 3)));
    }
    return sum;
  }
}
