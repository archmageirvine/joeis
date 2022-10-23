package irvine.oeis.a008;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008273 Number of performances of n fragments in Stockhausen problem.
 * @author Sean A. Irvine
 */
public class A008273 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mF.factorial(2 * k).shiftRight(k).subtract(mF.factorial(k).multiply(k))));
    }
    return sum;
  }
}

