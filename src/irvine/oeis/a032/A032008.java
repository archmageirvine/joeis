package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032008 "AFK" <code>(ordered</code>, size, unlabeled) transform of 1,3,5,7,...
 * @author Sean A. Irvine
 */
public class A032008 extends A032005 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Q> t1 = Y_RING.monomial(new Q(2 * k - 1), 1);
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(t1, k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
