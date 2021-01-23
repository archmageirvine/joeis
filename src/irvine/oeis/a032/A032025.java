package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032025 "AGK" (ordered, elements, unlabeled) transform of 1,2,3,4...
 * @author Sean A. Irvine
 */
public class A032025 extends A032023 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.pow(RING.onePlusXToTheN(Y_RING.x(), k), k, n);
      prod = RING.multiply(prod, u, n);
    }
    return RING.subtract(prod, RING.one());
  }
}
