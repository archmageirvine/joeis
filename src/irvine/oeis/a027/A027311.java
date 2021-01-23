package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026323;

/**
 * A027311 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+3), with T given by A026323.
 * @author Sean A. Irvine
 */
public class A027311 extends A026323 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 3)));
    }
    return sum;
  }
}
