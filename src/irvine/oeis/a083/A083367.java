package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083367 Numbers k that are equal to the sum of its divisors after the digits of each divisor have been sorted in ascending order.
 * @author Sean A. Irvine
 */
public class A083367 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    long sum = 0;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum += Functions.DIGIT_SORT_ASCENDING.l(d);
      if (sum > n) {
        return false;
      }
    }
    return sum == n;
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
