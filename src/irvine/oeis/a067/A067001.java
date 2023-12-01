package irvine.oeis.a067;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067001 Triangle T(n,k) = d(n-k,n), 0 &lt;= k &lt;= n, where d(l,m) = Sum_{k=l..m} 2^k * binomial(2*m-2*k, m-k) * binomial(m+k, m) * binomial(k, l).
 * @author Sean A. Irvine
 */
public class A067001 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z d(final int l, final int m) {
    return Integers.SINGLETON.sum(l, m, k -> Binomial.binomial(2L * m - 2L * k, m - k).multiply(Binomial.binomial(m + k, m)).multiply(Binomial.binomial(k, l)).shiftLeft(k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return d(mN - mM, mN);
  }
}
