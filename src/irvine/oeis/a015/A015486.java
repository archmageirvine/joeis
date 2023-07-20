package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A015486 a(0)=1, a(1)=2, a(n) = sum_{k=0}^{k=n-1} 2^k a(k).
 * @author Sean A. Irvine
 */
public class A015486 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.valueOf(n + 1);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(a(k).shiftLeft(k));
    }
    return sum;
  }
}
