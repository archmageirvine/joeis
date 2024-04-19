package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038041 Number of ways to partition an n-set into subsets of equal size.
 * @author Sean A. Irvine
 */
public class A038041 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(d)).divide(Functions.FACTORIAL.z(mN / d).pow(d)));
    }
    return sum;
  }
}
