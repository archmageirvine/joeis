package irvine.oeis.a048;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048144 a(n) = Sum_{k=0..n} (k!)^2 * Stirling_2(n,k)^2.
 * @author Sean A. Irvine
 */
public class A048144 extends Sequence0 {

  private int mN = -1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(k).multiply(Stirling.secondKind(mN, k)).square());
    }
    return sum;
  }
}

