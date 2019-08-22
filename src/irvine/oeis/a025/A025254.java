package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A025254 <code>a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-3)*a(3)</code> for <code>n &gt;= 4</code>.
 * @author Sean A. Irvine
 */
public class A025254 extends MemorySequence {

  private static final Z[] SMALL = {Z.THREE, Z.ONE, Z.ONE};
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
