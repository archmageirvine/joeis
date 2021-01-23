package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032059 "BGK" (reversible, element, unlabeled) transform of 1,0,1,0,...
 * @author Sean A. Irvine
 */
public class A032059 extends A032058 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    final Polynomial<Q> t1 = Y_RING.monomial(Q.ONE, 1);
    for (int k = 1; k <= n; k += 2) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(t1, k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
