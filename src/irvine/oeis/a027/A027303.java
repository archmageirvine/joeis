package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a008.A008315;

/**
 * A027303 a(n) = Sum_{k=0..floor((n-3)/2)} T(n,k) * T(n,k+2)}, with T given by A008315.
 * @author Sean A. Irvine
 */
public class A027303 extends A008315 {

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= (mN - 3) / 2; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, k + 2)));
    }
    return sum;
  }
}
