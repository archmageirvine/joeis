package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069667 Smallest nontrivial (no trailing zeros) n-digit square with minimum digit sum.
 * @author Sean A. Irvine
 */
public class A069667 extends Sequence1 {

  private Z mLimit = Z.ONE;

  @Override
  public Z next() {
    final Z start = mLimit;
    Z r = start.sqrt();
    mLimit = mLimit.multiply(10);
    long bestSum = Long.MAX_VALUE;
    Z best = null;
    Z s;
    while ((s = r.square()).compareTo(mLimit) < 0) {
      if (r.mod(10) != 0 && s.compareTo(start) >= 0) {
        final long sum = Functions.DIGIT_SUM.l(s);
        if (sum < bestSum) {
          bestSum = sum;
          best = s;
        }
      }
      r = r.add(1);
    }
    return best;
  }
}
