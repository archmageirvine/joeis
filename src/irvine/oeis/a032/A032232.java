package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032232 "DGK" <code>(bracelet</code>, element, unlabeled) transform of 2,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032232 extends A032231 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.pow(RING.onePlusXToTheN(T, 1), 2, n);
    for (int k = 2; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.onePlusXToTheN(T, k);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
