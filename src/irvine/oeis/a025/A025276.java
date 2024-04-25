package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A025276 a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ... + a(n-1)*a(1) for n &gt;= 5, with a(1) = 1, a(2) = a(3) = 0, a(4) = 1.
 * @author Sean A. Irvine
 */
public class A025276 extends MemorySequence {

  {
    setOffset(1);
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 4) {
      return Z.valueOf(1 - ((n & 2) >> 1));
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(a(k).multiply(a(n - k)));
    }
    return sum;
  }
}
