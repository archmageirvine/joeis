package irvine.oeis.a061;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061401 From solution to a Picard-Fuchs equation.
 * @author Sean A. Irvine
 */
public class A061401 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Q[] c = new Q[mN + 1];
    c[0] = Q.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final Q t = new Q(Functions.FACTORIAL.z(3 * k), Functions.FACTORIAL.z(k).pow(3).multiply(k));
      c[k] = (k & 1) == 1 ? t : t.negate();
    }
    final Polynomial<Q> f = Polynomial.create(c);
    final Polynomial<Q> h = RING.series(RING.x(), RING.exp(f, mN), mN);
    return RING.reversion(h, mN).coeff(mN).toZ();
  }
}

