package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032315 "EGJ" (unordered, element, labeled) transform of 1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A032315 extends A032312 {

  @Override
  protected Polynomial<Q> egj(final int n) {
    Q f = Q.ONE;
    Polynomial<Q> efk = RING.one();
    for (int k = 1; k <= n; ++k) {
      f = f.divide(k);
      efk = RING.multiply(efk, RING.pow(RING.onePlusXToTheN(f, k), k, n), n);
    }
    return efk;
  }
}
