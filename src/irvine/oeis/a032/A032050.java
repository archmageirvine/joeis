package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032050 "BGJ" (reversible, element, labeled) transform of 1,0,1,0... (odds).
 * @author Sean A. Irvine
 */
public class A032050 extends A032049 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q kf = Q.ONE;
    for (int k = 1; k <= n; ++k) {
      kf = kf.divide(k);
      if ((k & 1) == 1) {
        final Polynomial<Q> t1 = Y_RING.monomial(kf, 1);
        final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(t1, k);
        prod = RING.multiply(prod, u, n);
      }
    }
    return prod;
  }
}
