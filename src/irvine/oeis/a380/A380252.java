package irvine.oeis.a380;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a082.A082402;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.Triangle;

/**
 * A380252 Triangular array read by rows: T(n,k) is the number of labeled acyclic digraphs on n vertices with exactly k weakly connected components, n&gt;=0, 0&lt;=k&lt;=n.
 * @author Gregory Morse
 */
public class A380252 extends Triangle {
  private final MemorySequence mConnected = MemorySequence.cachedSequence(new A082402());

  @Override
  protected Z compute(final int n, final int k) {
    if (k == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= n - k + 1; ++j) {
      sum = sum.add(Binomial.binomial(n - 1, j - 1).multiply(mConnected.a(j)).multiply(get(n - j, k - 1)));
    }
    return sum;
  }
}
