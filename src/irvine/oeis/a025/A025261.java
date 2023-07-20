package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A025261 a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-3)*a(3) for n &gt;= 4.
 * @author Sean A. Irvine
 */
public class A025261 extends MemorySequence {

  private static final Z[] SMALL = {Z.THREE, Z.valueOf(-2), Z.ONE};
  {
    setOffset(1);
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
      sum = sum.add(a(k).multiply(a(n - k)));
    }
    return sum;
  }
}
