package irvine.oeis.a361;

import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A361587 Triangle read by rows: T(n,k) is the number of weakly connected digraphs on n unlabeled nodes with k strongly connected components.
 * @author Gregory Morse
 */
public class A361587 extends A361582 {
  @Override
  protected Polynomial<Polynomial<Q>> graphCounts(final int n) {
    return PolynomialUtils.inverseEuler(RING, super.graphCounts(n));
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : super.compute(n, k);
  }
}
