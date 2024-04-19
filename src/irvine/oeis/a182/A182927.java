package irvine.oeis.a182;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A182927 Row sums of A182928.
 * @author Sean A. Irvine
 */
public class A182927 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.subtract(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mN / d.intValueExact()).negate().pow(d).multiply(d)));
    }
    return sum;
  }
}
