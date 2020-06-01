package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;

/**
 * A032210 "DFJ" <code>(bracelet</code>, size, labeled) transform of 2,1,1,1...
 * @author Sean A. Irvine
 */
public class A032210 extends A032209 {

  protected static final PolynomialRingField<Q> Y_RING = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y_RING);

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.onePlusXToTheN(Y_RING.monomial(Q.TWO, 1), 1);
    Q f = Q.ONE;
    for (int k = 2; k <= n; ++k) {
      f = f.divide(new Q(k));
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.monomial(f, 1), k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
