package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065551 Triangle of Faulhaber numbers (numerators) read by rows.
 * @author Sean A. Irvine
 */
public class A065551 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Q t(final int n, final int k) {
    if (k == 0) {
      return n == 1 ? Q.ONE : Q.ZERO;
    }
    final int m = n + 1;
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("t", Rationals.SINGLETON, k + 1);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    final Polynomial<Q> sqrt = inner.multiply(inner.sqrt(inner.onePlusXToTheN(Q.FOUR, 1), k), Q.HALF);
    final Polynomial<Polynomial<Q>> a = ring.cosh(ring.monomial(sqrt, 1), m);
    final Polynomial<Polynomial<Q>> halfX = ring.monomial(Polynomial.create(Q.HALF), 1);
    final Polynomial<Polynomial<Q>> cosh = ring.cosh(halfX, m);
    final Polynomial<Polynomial<Q>> b = ring.subtract(a, cosh);
    final Polynomial<Polynomial<Q>> sinh = ring.sinh(halfX, m);
    final Polynomial<Polynomial<Q>> c = ring.series(b, ring.multiply(ring.monomial(inner.x(), 0), sinh), m);
    return c.coeff(n).coeff(k).multiply(Functions.FACTORIAL.z(n));
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return select(t(2 * mN + 1, mM));
  }
}
