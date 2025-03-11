package irvine.oeis.a075;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075837 Triangle T(n,k) = f(n,k,n-2), n &gt;= 0, 0 &lt;= k &lt;= n, where f is given below.
 * @author Sean A. Irvine
 */
public class A075837 extends Sequence1 {

  private long mN = -1;
  private long mM = 0;

  private Z f(final long n, final long p, final long k) {
    if (p == 0 || k == 0 || p == n) {
      if (n == 2 && p == 1) {
        return Z.ZERO;
      }
      return Z.ONE;
    }
    return ComputableReals.SINGLETON.hypergeometric(new CR[] {CR.ONE.subtract(k), CR.valueOf(-p), CR.valueOf(p - n)}, new CR[] {CR.ONE.subtract(n), CR.ONE}, CR.ONE).multiply(Binomial.binomial(n, k)).assumeInt().toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return f(mN, mM, mN - 2);
  }
}
