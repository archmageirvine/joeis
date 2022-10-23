package irvine.oeis.a048;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048163 a(n) = Sum_{k=1..n} ((k-1)!)^2*Stirling2(n,k)^2.
 * @author Sean A. Irvine
 */
public class A048163 extends Sequence1 {

  private int mN = 0;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(mF.factorial(k - 1).multiply(Stirling.secondKind(mN, k)).square());
    }
    return sum;
  }
}

