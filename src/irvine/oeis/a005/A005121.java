package irvine.oeis.a005;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A005121 Number of ultradissimilarity relations on <code>an</code> n-set.
 * @author Sean A. Irvine
 */
public class A005121 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size() + 1;
    if (n == 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      s = s.add(Stirling.secondKind(n, k).multiply(get(k - 1)));
    }
    return s;
  }
}

