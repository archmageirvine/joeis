package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032006 "AFK" (ordered, size, unlabeled) transform of 2,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032006 extends A032005 {

  private static final Polynomial<Polynomial<Q>> C = RING.onePlusXToTheN(Y_RING.monomial(Q.TWO, 1), 1);

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 2; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.x(), k);
      prod = RING.multiply(prod, u, n);
    }
    return RING.multiply(prod, C);
  }
}
