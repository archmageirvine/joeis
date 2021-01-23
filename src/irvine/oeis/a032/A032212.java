package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032212 "DFJ" (bracelet, size, labeled) transform of 1,3,5,7...
 * @author Sean A. Irvine
 */
public class A032212 extends A032209 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q f = Q.ONE;
    for (int k = 1; k <= n; ++k) {
      f = f.divide(new Q(k));
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.monomial(f.multiply(2L * k - 1), 1), k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
