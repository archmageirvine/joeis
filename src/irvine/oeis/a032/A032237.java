package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A032237 Shifts left 2 places under "DGK" (bracelet, element, unlabeled) transform.
 * @author Sean A. Irvine
 */
public class A032237 extends A032235 {

  @Override
  protected Z computeNext() {
    if (size() <= 2) {
      return start();
    }
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, product());
    final Polynomial<Q> p = v.coeff(size() - 2);
    return Y_RING.eval(Y_RING.serlaplace(p.shift(-1)), Q.ONE).add(p.coeff(1)).add(p.coeff(2)).divide(2).toZ();
  }
}
