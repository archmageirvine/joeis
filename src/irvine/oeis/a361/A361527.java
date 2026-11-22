package irvine.oeis.a361;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A361527 Triangular array read by rows.  T(n,k) is the number of labeled digraphs on [n] having exactly k strongly connected components all of which are simple cycles, n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Gregory Morse
 */
public class A361527 extends A361455 {
  @Override
  protected Polynomial<Z> component(final int n) {
    return RING.monomial(Functions.FACTORIAL.z(n - 1), 1);
  }
}
