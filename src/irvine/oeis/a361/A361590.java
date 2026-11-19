package irvine.oeis.a361;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A361590 Triangle read by rows: T(n,k) is the number of digraphs on n unlabeled nodes with exactly k strongly connected components of size 1.
 * @author Gregory Morse
 */
public class A361590 extends A361582 {
  @Override
  protected Polynomial<Q> mark(final int n) {
    return n == 1 ? RING.x() : RING.one();
  }
}
