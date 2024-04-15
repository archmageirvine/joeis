package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057531 Numbers whose sum of digits and number of divisors are equal.
 * @author Sean A. Irvine
 */
public class A057531 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.SIGMA0.l(mN) == Functions.DIGIT_SUM.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
