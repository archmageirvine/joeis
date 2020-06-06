package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A032238 Number of series-reduced dyslexic planted compound windmills with n leaves of 2 colors where any 2 submills extending from the same node are different.
 * @author Sean A. Irvine
 */
public class A032238 extends A032235 {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.TWO;
    }
    add(Z.ZERO);
    final Polynomial<Polynomial<Q>> v = RING.add(Y1, product());
    final Polynomial<Q> p = v.coeff(n);
    remove(n);
    return Y_RING.eval(Y_RING.serlaplace(p.shift(-1)), Q.ONE).add(p.coeff(1)).add(p.coeff(2)).divide(2).toZ();
  }
}
