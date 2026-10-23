package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086989 Sum of even-indexed divisors of n.
 * @author Sean A. Irvine
 */
public class A086989 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    boolean even = true;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      even = !even;
      if (even) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}
