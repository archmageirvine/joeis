package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069670 Largest n-digit triangular number with maximum digit sum.
 * @author Sean A. Irvine
 */
public class A069670 extends Sequence1 {

  private Z mLimit = Z.ONE;

  @Override
  public Z next() {
    final Z start = mLimit;
    Z r = Functions.TRINV.z(start);
    mLimit = mLimit.multiply(10);
    long bestSum = 0;
    Z best = null;
    Z tr;
    while ((tr = Functions.TRIANGULAR.z(r)).compareTo(mLimit) < 0) {
      if (tr.compareTo(start) >= 0) {
        final long sum = Functions.DIGIT_SUM.l(tr);
        if (sum >= bestSum) {
          bestSum = sum;
          best = tr;
        }
      }
      r = r.add(1);
    }
    return best;
  }
}
