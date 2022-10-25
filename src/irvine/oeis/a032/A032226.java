package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032226 Shifts left under "DGJ" (bracelet, element, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032226 extends A032213 {

  @Override
  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q f = Q.ONE;
    for (int k = 1; k < size(); ++k) {
      f = f.divide(new Q(k));
      final Polynomial<Polynomial<Q>> u = RING.powz(RING.onePlusXToTheN(Y_RING.monomial(f, 1), k), a(k), size());
      prod = RING.multiply(prod, u, size());
    }
    return prod;
  }
}
