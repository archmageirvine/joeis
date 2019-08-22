package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025267 <code>a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-1)*a(1)</code> for <code>n &gt;= 4</code>.
 * @author Sean A. Irvine
 */
public class A025267 extends MemorySequence {

  {
    add(null); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 3) {
      return n == 2 ? Z.NEG_ONE : Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(get(k).multiply(get(n - k)));
    }
    return sum;
  }
}
