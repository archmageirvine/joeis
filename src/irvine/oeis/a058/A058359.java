package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058359 Absolute value of difference between the even and odd first differences of the divisors of n.
 * @author Sean A. Irvine
 */
public class A058359 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prev = null;
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      if (prev != null) {
        final Z diff = d.subtract(prev);
        sum = sum.signedAdd(diff.isEven(), diff);
      }
      prev = d;
    }
    return sum.abs();
  }
}
