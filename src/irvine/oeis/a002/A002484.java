package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;

/**
 * A002484.
 * @author Sean A. Irvine
 */
public class A002484 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 2;

  private Q u(final int m, final Q t) {
    Q s = Q.ZERO;
    Q tp = Q.ONE;
    final Q tm = t.subtract(Q.ONE);
    for (int k = 0; k <= m; ++k) {
      final Z b = Binomial.binomial(2L * m - k, k);
      final Z f = mF.factorial(m - k);
      s = s.add(new Q(b.multiply(2L * m).multiply(f), Z.valueOf(2L * m - k)).multiply(tp));
      tp = tp.multiply(tm);
    }
    return s;
  }

  private Q a(final int n, final int d) {
    final Z nd = Z.valueOf(n / d);
    final Z p = nd.pow(d);
    return u(d, new Q(n - d, n)).multiply(Euler.phi(nd).multiply(p));
  }

  @Override
  public Z next() {
    final Z[] divisors = Cheetah.factor(++mN).divisors();
    Q s = Q.ZERO;
    for (final Z d : divisors) {
      s = s.add(a(mN, d.intValueExact()));
    }
    return s.divide(mN).toZ();
  }
}
