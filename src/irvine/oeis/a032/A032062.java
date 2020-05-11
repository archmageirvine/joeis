package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032062 "BGK" <code>(reversible</code>, element, unlabeled) transform of 2,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032062 extends A032061 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.pow(RING.onePlusXToTheN(Y_RING.monomial(Q.ONE, 1), 1), 2, n);
    final Polynomial<Q> t1 = Y_RING.monomial(Q.ONE, 1);
    for (int k = 2; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(t1, k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
