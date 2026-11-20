package irvine.oeis.a361;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A361592 Triangular array read by rows.  T(n,k) is the number of labeled digraphs on [n] with exactly k strongly connected components of size 1, n&gt;=0, 0&lt;=k&lt;=n.
 * @author Gregory Morse
 */
public class A361592 extends A361455 {
  @Override
  protected Polynomial<Z> component(final int n) {
    return RING.monomial(strong(n), n == 1 ? 1 : 0);
  }
}
