package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a008.A008288;

/**
 * A026936 a(n) = Sum_{k=0..n-3} T(n,k) * T(n,k+3), with T given by A008288.
 * @author Sean A. Irvine
 */
public class A026936 extends A008288 {

  /** Construct the sequence. */
  public A026936() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 2; ++k) {
      sum = sum.add(get(mN - k, k).multiply(get(mN - k - 3, k + 3)));
    }
    return sum;
  }
}
