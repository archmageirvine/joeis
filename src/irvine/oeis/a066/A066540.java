package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066540 The first of two consecutive primes with equal digital sums.
 * @author Sean A. Irvine
 */
public class A066540 extends A000040 {

  private Z mP = super.next();
  private long mSum = Functions.DIGIT_SUM.l(mP);

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      final long sum = mSum;
      mP = super.next();
      mSum = Functions.DIGIT_SUM.l(mP);
      if (mSum == sum) {
        return q;
      }
    }
  }
}
