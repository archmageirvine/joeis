package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A051296 INVERT transform of factorial numbers.
 * @author Sean A. Irvine
 */
public class A051296 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 1; k <= n; ++k) {
      f = f.multiply(k);
      sum = sum.add(f.multiply(a(n - k)));
    }
    return sum;
  }
}
