package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034690 Sum of digits of all the divisors of n.
 * @author Sean A. Irvine
 */
public class A034690 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Functions.DIGIT_SUM.l(d));
    }
    return sum;
  }
}
