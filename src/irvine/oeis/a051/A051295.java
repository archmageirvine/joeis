package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A051233.
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
      sum = sum.add(f.multiply(get(n - 1 - k)));
    }
    return sum;
  }
}
