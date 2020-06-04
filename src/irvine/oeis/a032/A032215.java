package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032215.
 * @author Sean A. Irvine
 */
public class A032215 extends A032214 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    final Polynomial<Q> t = Y_RING.monomial(Q.ONE, 1);
    Polynomial<Polynomial<Q>> prod = RING.onePlusXToTheN(Y_RING.monomial(Q.TWO, 1), 1);
    for (int k = 2; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(t, k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
