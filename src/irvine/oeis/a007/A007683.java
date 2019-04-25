package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007683 <code>a(1) = 1</code>; <code>a(n) = -Sum_{k = 1..n-1} (n+k)!a(k)/(2k)!</code>.
 * @author Sean A. Irvine
 */
public class A007683 extends MemorySequence {

  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  protected Z computeNext() {
    final int n = size() + 1;
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(get(k - 1).multiply(mF.factorial(n + k)).divide(mF.factorial(2 * k)));
    }
    return sum.negate();
  }
}
