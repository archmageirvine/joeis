package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A051295 a(0)=1; thereafter, a(m+1) = Sum_{k=0..m} k!*a(m-k).
 * @author Sean A. Irvine
 */
public class A051295 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k < n; ++k) {
      if (k > 1) {
        f = f.multiply(k);
      }
      sum = sum.add(f.multiply(a(n - 1 - k)));
    }
    return sum;
  }
}
