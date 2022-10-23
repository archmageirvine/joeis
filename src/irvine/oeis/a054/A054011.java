package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054011 n is not divisible by the number of its proper divisors.
 * @author Sean A. Irvine
 */
public class A054011 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN % (Jaguar.factor(mN).sigma0AsLong() - 1) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
