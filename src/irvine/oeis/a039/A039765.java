package irvine.oeis.a039;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A039765 Number of edges in the Hasse diagrams for the D-analogs of the partition lattices.
 * @author Sean A. Irvine
 */
public class A039765 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO_X = RING.monomial(Q.TWO, 1);
  private static final Polynomial<Q> FOUR_X = RING.monomial(Q.FOUR, 1);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.HALF.negate(), Q.ONE));

  private Z mF = Z.ONE;
  private int mN = -1;

  private Polynomial<Q> e(final long n, final int degree) {
    final Q qn = new Q(n);
    return RING.divide(RING.exp(RING.monomial(qn, 1), degree), qn);
  }

  private Polynomial<Q> f(final long n, final int degree) {
    final Q qn = new Q(n);
    return RING.divide(RING.subtract(RING.exp(RING.monomial(qn, 1), degree), RING.one()), qn);
  }

  private Polynomial<Q> g(final long n, final int degree) {
    final Q qn = new Q(n);
    return RING.subtract(RING.divide(RING.subtract(RING.exp(RING.monomial(qn, 1), degree), RING.one()), qn), RING.x());
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> e1 = e(1, mN);
    final Polynomial<Q> a = RING.multiply(f(4, mN), g(1, mN), mN);
    final Polynomial<Q> b = RING.substitute(e1, f(2, mN), mN);

    final Polynomial<Q> c = RING.multiply(e1, g(4, mN), mN);
    final Polynomial<Q> d = RING.substitute(e1, g(2, mN), mN);

    return RING.multiply(a, b, mN).coeff(mN).add(RING.multiply(c, d, mN).coeff(mN)).multiply(mF).toZ();
  }
}
