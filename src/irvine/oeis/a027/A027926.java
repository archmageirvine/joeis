package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027926 Triangular array T read by rows: T(n,0) = T(n,2n) = 1 for n &gt;= 0; T(n,1) = 1 for n &gt;= 1; T(n,k) = T(n-1,k-2) + T(n-1,k-1) for k = 2..2n-1, n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A027926 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  static Z t(final long n, final long m) {
    Z sum = Z.ZERO;
    for (long k = 0; k <= (2 * n - m + 1) / 2; ++k) {
      sum = sum.add(Binomial.binomial(n - k, 2 * n - m - 2 * k));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }

}
