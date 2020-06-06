package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032223 "DGJ" <code>(bracelet</code>, element, labeled) transform of 2,1,1,1...
 * @author Sean A. Irvine
 */
public class A032223 extends A032209 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.pow(RING.onePlusXToTheN(Y_RING.monomial(Q.ONE, 1), 1), 2, n);
    Q f = Q.ONE;
    for (int k = 2; k <= n; ++k) {
      f = f.divide(new Q(k));
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(Y_RING.monomial(f, 1), k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
