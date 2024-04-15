package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054010 Numbers n with property that n is divisible by the number of its proper divisors.
 * @author Sean A. Irvine
 */
public class A054010 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN % (Functions.SIGMA0.l(mN) - 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
