package irvine.oeis.a075;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075779 Triangle T(n,k) = f(n,k,n-1), n &gt;= 2, 1 &lt;= k &lt;= n-1, where f is given below.
 * @author Sean A. Irvine
 */
public class A075779 extends Sequence2 {

  private long mN = 1;
  private long mM = 0;

  private Z f(final long n, final long p, final long k) {
    return ComputableReals.SINGLETON.hypergeometric(new CR[] {CR.ONE.subtract(k), CR.valueOf(-p), CR.valueOf(p - n)}, new CR[] {CR.ONE.subtract(n), CR.ONE}, CR.ONE).multiply(Binomial.binomial(n, k)).assumeInt().toZ();
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return f(mN, mM, mN - 1);
  }
}
