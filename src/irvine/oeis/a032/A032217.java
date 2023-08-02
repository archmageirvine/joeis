package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032217 "DFK" (bracelet, size, unlabeled) transform of 1,3,5,7...
 * @author Sean A. Irvine
 */
public class A032217 extends A032214 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.monomial(new Q(2L * k - 1), 1), k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
