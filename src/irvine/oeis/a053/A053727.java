package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053727 Triangle T(n,k) = Sum_{d|gcd(n,k)} mu(d)*C(n/d,k/d) (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A053727 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(LongUtils.gcd(n, m)).divisors()) {
      final long d = dd.longValue();
      final int mu = Functions.MOBIUS.i(d);
      if (mu != 0) {
        sum = sum.signedAdd(mu == 1, Binomial.binomial(n / d, m / d));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
