package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032222 "DGJ" <code>(bracelet</code>, element, labeled) transform of 2,2,2,2...
 * @author Sean A. Irvine
 */
public class A032222 extends A032209 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q f = Q.ONE;
    for (int k = 1; k <= n; ++k) {
      f = f.divide(new Q(k));
      final Polynomial<Polynomial<Q>> u = RING.pow(RING.onePlusXToTheN(Y_RING.monomial(f, 1), k), 2, n);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
