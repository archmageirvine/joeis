package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025244.
 * @author Sean A. Irvine
 */
public class A025244 extends MemorySequence {

  {
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return n == 3 ? Z.TWO : Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n - 3; ++k) {
      sum = sum.add(get(k).multiply(get(n - k)));
    }
    return sum;
  }
}
