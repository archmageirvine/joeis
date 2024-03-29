package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038042 Number of ways to partition a 2-colored labeled set into identical subsets.
 * @author Sean A. Irvine
 */
public class A038042 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mF.factorial(mN).shiftLeft(d).divide(mF.factorial(d)).divide(mF.factorial(mN / d).pow(d)));
    }
    return sum;
  }
}
