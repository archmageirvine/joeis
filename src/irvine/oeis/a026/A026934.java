package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a008.A008288;

/**
 * A026934 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+1), with T given by A008288.
 * @author Sean A. Irvine
 */
public class A026934 extends A008288 {

  /** Construct the sequence. */
  public A026934() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN - k, k).multiply(get(mN - k - 1, k + 1)));
    }
    return sum;
  }
}
