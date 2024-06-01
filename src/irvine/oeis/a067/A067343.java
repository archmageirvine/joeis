package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067343 Sum of decimal digits of n equals sum of decimal digits of sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A067343 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long sum = Functions.DIGIT_SUM.l(++mN);
      final long dsum = Functions.DIGIT_SUM.l(Functions.SIGMA1.z(mN));
      if (dsum == sum) {
        return Z.valueOf(mN);
      }
    }
  }
}

