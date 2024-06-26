package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034842 Number of divisors = last digit.
 * @author Sean A. Irvine
 */
public class A034842 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.l(++mN) == mN % 10) {
        return Z.valueOf(mN);
      }
    }
  }
}
