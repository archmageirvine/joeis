package irvine.oeis.a182;

import irvine.factor.factor.Cheetah;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A182927.
 * @author Sean A. Irvine
 */
public class A182927 implements Sequence {

  private int mN = 0;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.subtract(mF.factorial(mN).divide(mF.factorial(mN / d.intValueExact()).negate().pow(d).multiply(d)));
    }
    return sum;
  }
}
