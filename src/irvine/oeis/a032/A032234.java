package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032234 "DGK" (bracelet, element, unlabeled) transform of 1,3,5,7,...
 * @author Sean A. Irvine
 */
public class A032234 extends A032231 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.pow(RING.onePlusXToTheN(T, k), 2L * k - 1, n);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
