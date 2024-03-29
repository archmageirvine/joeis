package irvine.oeis.a182;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A182927 Row sums of A182928.
 * @author Sean A. Irvine
 */
public class A182927 extends Sequence1 {

  private int mN = 0;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.subtract(mF.factorial(mN).divide(mF.factorial(mN / d.intValueExact()).negate().pow(d).multiply(d)));
    }
    return sum;
  }
}
