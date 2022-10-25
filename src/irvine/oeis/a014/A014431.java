package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A014431 a(1) = 1, a(2) = 2, a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-2)*a(2) for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A014431 extends MemorySequence {

  {
    setOffset(1);
  }

  protected Z a1() {
    return Z.TWO;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return n == 0 ? Z.ONE : a1();
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n - 1; ++k) {
      sum = sum.add(get(k).multiply(get(n - k - 1)));
    }
    return sum;
  }
}

