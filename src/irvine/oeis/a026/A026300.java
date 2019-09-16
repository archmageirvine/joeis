package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026300 Motzkin triangle, T, read by rows; <code>T(0,0) = T(1,0) = T(1,1) = 1</code>; for <code>n &gt;= 2, T(n,0) = 1, T(n,k) = T(n-1,k-2) + T(n-1,k-1) + T(n-1,k)</code> for k <code>= 1,2,...,n-1</code> and <code>T(n,n) = T(n-1,n-2) + T(n-1,n-1)</code>.
 * @author Sean A. Irvine
 */
public class A026300 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    Z sum = Z.ZERO;
    for (long k = 0; k <= m / 2; ++k) {
      final long u = 2 * k + n - m;
      sum = sum.add(Binomial.binomial(n, u).multiply(Binomial.binomial(u, k).subtract(Binomial.binomial(u, k - 1))));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
