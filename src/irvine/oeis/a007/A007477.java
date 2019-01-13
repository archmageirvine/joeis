package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007477.
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
        sum = sum.add(get(k).multiply(get(n - 2 - k)));
      }
      return sum;
    }
  }
}
