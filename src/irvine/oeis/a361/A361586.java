package irvine.oeis.a361;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A361586 Number of digraphs on n unlabeled nodes in which every node belongs to a directed cycle.
 * @author Gregory Morse
 */
public class A361586 extends A361582 {
  private int mN = -1;

  @Override
  protected Polynomial<Q> mark(final int n) {
    return n == 1 ? RING.zero() : RING.one();
  }

  @Override
  public Z next() {
    return row(++mN).coeff(0).toZ();
  }
}
