package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A054253 a(n) = n + max{ a(i)*a(n-i) ; 1 &lt;= i &lt;= n-1 }, a(n) = n for n &lt;= 2.
 * @author Sean A. Irvine
 */
public class A054253 extends MemorySequence {

  {
    setOffset(1);
    add(null); // 0 unused
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.valueOf(n);
    }
    Z max = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      max = max.max(a(k).multiply(a(n - k)));
    }
    return max.add(n);
  }
}

