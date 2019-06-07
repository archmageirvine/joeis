package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020921 Triangle read by rows: <code>T(m,n) =</code> number of solutions to <code>1 &lt;= a(1) &lt; a(2) &lt; ... &lt; a(m) &lt;=</code> n, where <code>gcd( a(1), a(2)</code>, ..., <code>a(m), n) = 1</code>.
 * @author Sean A. Irvine
 */
public class A020921 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long k) {
    if (n <= 0) {
      return k == 0 && n == 0 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Binomial.binomial(n / d, k).multiply(Mobius.mobius(d)));
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
