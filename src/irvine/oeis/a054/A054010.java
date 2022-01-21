package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054010 Numbers n with property that n is divisible by the number of its proper divisors.
 * @author Sean A. Irvine
 */
public class A054010 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN % (Cheetah.factor(mN).sigma0AsLong() - 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
