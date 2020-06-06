package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032233 "DGK" <code>(bracelet</code>, element, unlabeled) transform of 1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A032233 extends A032231 {

  @Override
  protected Polynomial<Polynomial<Q>> product(final int n) {
    Polynomial<Polynomial<Q>> prod = RING.one();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> u = RING.pow(RING.onePlusXToTheN(T, k), k, n);
      prod = RING.multiply(prod, u, n);
    }
    return prod;
  }
}
