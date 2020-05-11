package irvine.oeis.a032;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A032047 Number of dyslexic planted planar trees with <code>n+1</code> nodes where any 2 subtrees extending from the same node are different sizes.
 * @author Sean A. Irvine
 */
public class A032047 extends A032009 {

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> v = product();
    return Y_RING.eval(Y_RING.serlaplace(v.coeff(size() - 1)), Q.ONE).add(get(size() - 1)).toZ().divide2();
  }
}
