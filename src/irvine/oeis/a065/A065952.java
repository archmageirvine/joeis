package irvine.oeis.a065;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065952 Numerator of (-1)^n*n!*(E(n,2)-E(n,1)*E(n-1,1)) where E(n,x) = Sum_{k=0..n} (-1)^k*x^k/k!.
 * @author Sean A. Irvine
 */
public class A065952 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  private static Polynomial<Q> e(final int n) {
    final Q[] c = new Q[n + 1];
    for (int k = 0; k < c.length; ++k) {
      c[k] = new Q(Z.NEG_ONE.pow(k), MemoryFactorial.SINGLETON.factorial(k));
    }
    return Polynomial.create(c);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    final Polynomial<Q> e = e(++mN);
    return select(RING.eval(e, Q.TWO).subtract(RING.eval(e, Q.ONE).multiply(RING.eval(e.truncate(mN - 1), Q.ONE))).multiply(MemoryFactorial.SINGLETON.factorial(mN)).multiply(Z.NEG_ONE.pow(mN)));
  }
}
