package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073804 Number of divisors of n is greater than that of sigma[n].
 * @author Sean A. Irvine
 */
public class A073804 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.l(++mN) > Functions.SIGMA0.l(Functions.SIGMA.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
