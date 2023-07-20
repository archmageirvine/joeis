package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A001059 Number of doubly labeled heap-ordered trees.
 * @author Sean A. Irvine
 */
public class A001059 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    } else {
      Z s = Z.ZERO;
      for (int k = 0; k < n; ++k) {
        s = s.add(Binomial.binomial(n, k).square().multiply(a(k)).multiply(a(n - k - 1)));
      }
      return s;
    }
  }
}
