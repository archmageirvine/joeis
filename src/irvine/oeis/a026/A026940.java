package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026940 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+1), with T given by A026300.
 * @author Sean A. Irvine
 */
public class A026940 extends A026300 {

  /** Construct the sequence. */
  public A026940() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, k + 1)));
    }
    return sum;
  }
}
