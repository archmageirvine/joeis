package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a008.A008315;

/**
 * A027304 a(n) = Sum_{k=0..floor((n-5)/2)} T(n,k) * T(n,k+1)}, with T given by A008315.
 * @author Sean A. Irvine
 */
public class A027304 extends A008315 {

  /** Construct the sequence. */
  public A027304() {
    super(5);
  }

  private long mN = 5;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= (mN - 5) / 2; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, k + 3)));
    }
    return sum;
  }
}
