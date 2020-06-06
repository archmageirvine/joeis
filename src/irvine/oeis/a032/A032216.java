package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032216 "DFK" <code>(bracelet</code>, size, unlabeled) transform of 1,2,3,4...
 * @author Sean A. Irvine
 */
public class A032216 extends A032214 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.monomial(new Q(k), 1), k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
