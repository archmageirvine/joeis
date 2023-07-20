package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A061061 Maximal number of 132 patterns in a permutation of 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A061061 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z max = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      max = max.max(a(k).add((k + 1) * ((long) (n - k) * (n - k - 1) / 2)));
    }
    return max;
  }
}
