package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032016 "AGJ" <code>(ordered</code>, elements, labeled) transform of 1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A032016 extends A032000 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q kf = Q.ONE;
    for (int k = 1; k <= n; ++k) {
      kf = kf.divide(k);
      final Polynomial<Q> t1 = Y_RING.monomial(kf, 1);
      final Polynomial<Polynomial<Q>> u = RING.pow(RING.onePlusXToTheN(t1, k), k, n);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
