package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A007477 Shifts 2 places left when convolved with itself.
 * @author Sean A. Irvine
 */
public class A007477 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    } else {
      Z sum = Z.ZERO;
      for (int k = 0; k < n - 1; ++k) {
        sum = sum.add(a(k).multiply(a(n - 2 - k)));
      }
      return sum;
    }
  }
}
