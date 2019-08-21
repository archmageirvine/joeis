package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025260.
 * @author Sean A. Irvine
 */
public class A025260 extends MemorySequence {

  private static final Z[] SMALL = {Z.TWO, Z.valueOf(-2), Z.ONE};
  {
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return SMALL[n - 1];
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n - 3; ++k) {
      sum = sum.add(get(k).multiply(get(n - k)));
    }
    return sum;
  }
}
