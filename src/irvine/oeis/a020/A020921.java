package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020921 Triangle read by rows: T(m,n) = number of solutions to 1 &lt;= a(1) &lt; a(2) &lt; ... &lt; a(m) &lt;= n, where gcd( a(1), a(2), ..., a(m), n) = 1.
 * @author Sean A. Irvine
 */
public class A020921 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long k) {
    if (n <= 0) {
      return k == 0 && n == 0 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Binomial.binomial(n / d, k).multiply(Functions.MOBIUS.i(d)));
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
