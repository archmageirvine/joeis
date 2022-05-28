package irvine.oeis.a057;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A057271.
 * @author Sean A. Irvine
 */
public class A057271 extends A057273 {

  private int mN = 0;
  private int mM = 0;
  private Z mF = Z.ONE;
  private Polynomial<Q> mRow = null;

  private Polynomial<Polynomial<Q>> initFinally(final int n, final Polynomial<Q> e, final int m) {
    // Take care here to ensure expansions in y are limited to degree m
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    final Polynomial<Polynomial<Q>> s = strongD(n, m, e);
    final Polynomial<Polynomial<Q>> g1 = g(e, ring.multiply(s, ring.exp(ring.negate(s), n), n), m);
    final Polynomial<Polynomial<Q>> g2 = g(e, digraphEgf(n, m, e), m);
    final Polynomial<Polynomial<Q>> u = u(e, ring.multiply(ring.multiply(g1, g1, n), g2, n), m);
    final Polynomial<Polynomial<Q>> us = ring.multiply(ring.exp(s, n), u, n);
    return ring.add(ring.subtract(s, ring.multiply(s, s, n)), us);
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1)) {
      mF = mF.multiply(++mN);
      mM = 0;
      mRow = initFinally(mN, RING_Y.onePlusXToTheN(1), mN * (mN - 1)).coeff(mN);
    }
    return mRow.coeff(mM).multiply(mF).toZ();
  }
}
