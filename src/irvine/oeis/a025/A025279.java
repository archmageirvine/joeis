package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025279.
 * @author Sean A. Irvine
 */
public class A025279 extends MemorySequence {

  private Z[] SMALL = {Z.ONE, Z.ZERO, Z.NEG_ONE, Z.ONE};
  {
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return SMALL[n - 1];
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(get(k).multiply(get(n - k)));
    }
    return sum;
  }
}
