package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032135 "CFJ" <code>(necklace</code>, size, labeled) transform of 2,1,1,1...
 * @author Sean A. Irvine
 */
public class A032135 extends A032134 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.onePlusXToTheN(Y_RING.monomial(Q.TWO, 1), 1);
    Q kf = Q.ONE;
    for (int k = 2; k <= n; ++k) {
      kf = kf.divide(k);
      final Polynomial<Q> t1 = Y_RING.monomial(kf, 1);
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(t1, k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
