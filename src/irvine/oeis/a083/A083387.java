package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083387 Numbers n such that the number formed by the digits of 2n sorted in ascending order is equal to the sum of the divisors of n after the digits of each divisor have been sorted in ascending order.
 * @author Sean A. Irvine
 */
public class A083387 extends Sequence1 {

  private long mN = 5;

  private boolean is(final long n) {
    final Z t = Functions.DIGIT_SORT_ASCENDING.z(2 * n);
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(Functions.DIGIT_SORT_ASCENDING.z(d));
      if (sum.compareTo(t) > 0) {
        return false;
      }
    }
    return sum.equals(t);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
