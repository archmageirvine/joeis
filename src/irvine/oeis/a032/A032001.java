package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032001 "AFJ" <code>(ordered</code>, size, labeled) transform of 2,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032001 extends A032000 {

  private static final Polynomial<Polynomial<Q>> C = RING.onePlusXToTheN(Y_RING.monomial(Q.TWO, 1), 1);

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q kf = Q.ONE;
    for (int k = 2; k <= n; ++k) {
      kf = kf.divide(k);
      final Polynomial<Q> t1 = Y_RING.monomial(kf, 1);
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(t1, k);
      prod = RING.multiply(prod, u, n);
    }
    return RING.multiply(prod, C);
  }
}
