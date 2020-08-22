package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032147 "CGJ" (necklace, element, labeled) transform of 2,2,2,2...
 * @author Sean A. Irvine
 */
public class A032147 extends A032144 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q kf = Q.ONE;
    for (int k = 1; k <= n; ++k) {
      kf = kf.divide(k);
      final Polynomial<Q> t1 = Y_RING.monomial(kf, 1);
      final Polynomial<Polynomial<Q>> u = RING.pow(RING.onePlusXToTheN(t1, k), 2, n);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
