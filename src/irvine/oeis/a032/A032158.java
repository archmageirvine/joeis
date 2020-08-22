package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;

/**
 * A032158 "CGK" (necklace, element, unlabeled) transform of 1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A032158 extends A032153 {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);

  @Override
  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k < size(); ++k) {
      final Polynomial<Polynomial<Q>> u = RING.pow(RING.onePlusXToTheN(Y_RING.x(), k), k, size());
      prod = RING.multiply(prod, u, size());
    }
    return prod;
  }
}
