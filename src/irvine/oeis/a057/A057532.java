package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057532 n is odd and sum of digits of n equals the numbers of divisors of n.
 * @author Sean A. Irvine
 */
public class A057532 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Jaguar.factor(mN).sigma0AsLong() == Functions.DIGIT_SUM.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
