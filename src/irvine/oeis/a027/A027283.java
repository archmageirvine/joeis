package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026584;

/**
 * A027283 a(n) = Sum_{k=0..2*n-1} T(n,k) * T(n,k+1), with T given by A026584.
 * @author Sean A. Irvine
 */
public class A027283 extends A026584 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, 2 * mN - k - 1)));
    }
    return sum;
  }
}
