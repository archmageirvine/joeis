package irvine.oeis.a073;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073253 Table of expansion of Product (1+(xy)^n/y)(1+(xy)^n/x), n&gt;0 by antidiagonals.
 * @author Sean A. Irvine
 */
public class A073253 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    if (n < 0 || m < 0) {
      return Z.ZERO;
    }
    final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, m);
    final DegreeLimitedPolynomialRingField<Polynomial<Z>> ring = new DegreeLimitedPolynomialRingField<>(inner, n);
    Polynomial<Polynomial<Z>> prod = ring.one();
    for (int k = 1; k <= Math.max(n, m); ++k) {
      final Polynomial<Polynomial<Z>> r = ring.onePlusXToTheN(inner.monomial(Z.ONE, k - 1), k);
      final Polynomial<Polynomial<Z>> s = ring.onePlusXToTheN(inner.monomial(Z.ONE, k), k - 1);
      prod = ring.multiply(prod, ring.multiply(r, s));
    }
    return prod.coeff(n).coeff(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

