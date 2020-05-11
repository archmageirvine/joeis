package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032017 "AGJ" <code>(ordered</code>, elements, labeled) transform of 1,3,5,7,...
 * @author Sean A. Irvine
 */
public class A032017 extends A032000 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q kf = Q.ONE;
    for (int k = 1; k <= n; ++k) {
      kf = kf.divide(k);
      final Polynomial<Q> t1 = Y_RING.monomial(kf, 1);
      final Polynomial<Polynomial<Q>> u = RING.pow(RING.onePlusXToTheN(t1, k), 2 * k - 1, n);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
