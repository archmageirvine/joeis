package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086988 Sum of odd indexed divisors of n.
 * @author Sean A. Irvine
 */
public class A086988 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    boolean odd = false;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      odd = !odd;
      if (odd) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}
