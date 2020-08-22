package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032024 "AGK" (ordered, elements, unlabeled) transform of 2,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032024 extends A032023 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.pow(RING.onePlusXToTheN(Y_RING.x(), 1), 2, n);
    for (int k = 2; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.x(), k);
      prod = RING.multiply(prod, u, n);
    }
    return RING.subtract(prod, RING.one());
  }
}
