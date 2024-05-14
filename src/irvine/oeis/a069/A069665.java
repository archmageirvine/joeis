package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069665 Smallest n-digit square with maximum digit sum.
 * @author Sean A. Irvine
 */
public class A069665 extends Sequence1 {

  private Z mLimit = Z.ONE;

  @Override
  public Z next() {
    final Z start = mLimit;
    Z r = start.sqrt();
    mLimit = mLimit.multiply(10);
    long bestSum = 0;
    Z best = null;
    Z s;
    while ((s = r.square()).compareTo(mLimit) < 0) {
      if (s.compareTo(start) >= 0) {
        final long sum = Functions.DIGIT_SUM.l(s);
        if (sum > bestSum) {
          bestSum = sum;
          best = s;
        }
      }
      r = r.add(1);
    }
    return best;
  }
}
