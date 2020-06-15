package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A032313 "EGJ" <code>(unordered</code>, element, labeled) transform of 2,1,1,1...
 * @author Sean A. Irvine
 */
public class A032313 extends A032312 {

  @Override
  protected Polynomial<Q> egj(final int n) {
    Q f = Q.ONE;
    Polynomial<Q> efk = RING.onePlusXToTheN(1);
    for (int k = 1; k <= n; ++k) {
      f = f.divide(k);
      efk = RING.multiply(efk, RING.onePlusXToTheN(f, k), n);
    }
    return efk;
  }
}
