package irvine.oeis.a361;

import irvine.math.z.Z;

/**
 * A361269 Triangular array read by rows. T(n,k) is the number of binary relations on [n] containing exactly k strongly connected components, n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Gregory Morse
 */
public class A361269 extends A361455 {
  @Override
  protected Z compute(final int n, final int k) {
    return super.compute(n, k).shiftLeft(n);
  }
}
