package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032314 "EGJ" <code>(unordered</code>, element, labeled) transform of 3,3,3,3...
 * @author Sean A. Irvine
 */
public class A032314 extends A032312 {

  @Override
  protected Polynomial<Q> egj(final int n) {
    Q f = Q.ONE;
    Polynomial<Q> efk = RING.one();
    for (int k = 1; k <= n; ++k) {
      f = f.divide(k);
      efk = RING.multiply(efk, RING.pow(RING.onePlusXToTheN(f, k), 3, n), n);
    }
    return efk;
  }
}
