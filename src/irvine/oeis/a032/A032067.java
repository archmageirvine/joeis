package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A032067.
 * @author Sean A. Irvine
 */
public class A032067 extends A032065 {

  @Override
  protected Z computeNext() {
    if (size() < 3) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, product());
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(size() - 2)), Q.ONE).add(get(size() - 2)).toZ().divide2();
  }
}
