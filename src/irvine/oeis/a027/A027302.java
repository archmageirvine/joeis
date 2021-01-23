package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a008.A008315;

/**
 * A027302 a(n) = Sum_{k=0..floor((n-1)/2)} T(n,k) * T(n,k+1), with T given by A008315.
 * @author Sean A. Irvine
 */
public class A027302 extends A008315 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN / 2; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, k + 1)));
    }
    return sum;
  }
}
