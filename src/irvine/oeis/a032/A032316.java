package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032316 "EGJ" <code>(unordered</code>, element, labeled) transform of 1,3,5,7...
 * @author Sean A. Irvine
 */
public class A032316 extends A032312 {

  @Override
  protected Polynomial<Q> egj(final int n) {
    Q f = Q.ONE;
    Polynomial<Q> efk = RING.one();
    for (int k = 1; k <= n; ++k) {
      f = f.divide(k);
      efk = RING.multiply(efk, RING.pow(RING.onePlusXToTheN(f, k), 2 * k - 1, n), n);
    }
    return efk;
  }
}
