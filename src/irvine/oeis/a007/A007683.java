package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A007683 a(1) = 1; a(n) = -Sum_{k = 1..n-1} (n+k)!a(k)/(2k)!.
 * @author Sean A. Irvine
 */
public class A007683 extends MemorySequence {

  {
    setOffset(1);
  }


  @Override
  protected Z computeNext() {
    final int n = size() + 1;
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(a(k - 1).multiply(Functions.FACTORIAL.z(n + k)).divide(Functions.FACTORIAL.z(2 * k)));
    }
    return sum.negate();
  }
}
