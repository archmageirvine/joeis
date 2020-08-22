package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026323;

/**
 * A027309 a(n) = Sum_{k=0..n+1} T(n,k) * T(n,k+1), with T given by A026323.
 * @author Sean A. Irvine
 */
public class A027309 extends A026323 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN + 1; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 1)));
    }
    return sum;
  }
}
