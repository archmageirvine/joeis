package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026941 a(n) = Sum_{k=0..n-2} T(n,k) * T(n,k+2), with T given by A026300.
 * @author Sean A. Irvine
 */
public class A026941 extends A026300 {

  /** Construct the sequence. */
  public A026941() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 1; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, k + 2)));
    }
    return sum;
  }
}
