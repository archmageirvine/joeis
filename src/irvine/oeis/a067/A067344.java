package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067344 Sum of decimal digits of square of divisors of n equals sum of square of digits of n.
 * @author Sean A. Irvine
 */
public class A067344 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long sum = Functions.DIGIT_SUM_SQUARES.l(++mN);
      final long dsum = Functions.DIGIT_SUM.l(Functions.SIGMA.z(2, mN));
      if (dsum == sum) {
        return Z.valueOf(mN);
      }
    }
  }
}

