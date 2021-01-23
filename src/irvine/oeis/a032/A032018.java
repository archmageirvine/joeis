package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032018 Shifts left under "AGJ" (ordered, elements, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032018 extends A032004 {

  @Override
  protected Polynomial<Polynomial<Q>> product() {
    Polynomial<Polynomial<Q>> prod = RING.one();
    Q kf = Q.ONE;
    for (int k = 1; k < size(); ++k) {
      kf = kf.divide(k);
      final Polynomial<Q> t1 = Y_RING.monomial(kf, 1);
      final Polynomial<Polynomial<Q>> u = RING.powz(RING.onePlusXToTheN(t1, k), get(k), size());
      prod = RING.multiply(prod, u, size());
    }
    return prod;
  }
}
