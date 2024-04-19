package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A007682 a(n) = -Sum_{k = 0..n-1} (n+k)!a(k)/(2k)!.
 * @author Sean A. Irvine
 */
public class A007682 extends MemorySequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(a(k).multiply(Functions.FACTORIAL.z(n + k)).divide(Functions.FACTORIAL.z(2 * k)));
    }
    return sum.negate();
  }
}
