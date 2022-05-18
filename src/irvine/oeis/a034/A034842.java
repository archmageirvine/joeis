package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034842 Number of divisors = last digit.
 * @author Sean A. Irvine
 */
public class A034842 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma0().longValueExact() == mN % 10) {
        return Z.valueOf(mN);
      }
    }
  }
}
