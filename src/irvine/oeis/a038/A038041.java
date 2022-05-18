package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038041 Number of ways to partition an n-set into subsets of equal size.
 * @author Sean A. Irvine
 */
public class A038041 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mF.factorial(mN).divide(mF.factorial(d)).divide(mF.factorial(mN / d).pow(d)));
    }
    return sum;
  }
}
