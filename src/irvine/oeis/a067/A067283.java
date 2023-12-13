package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067283 Numbers n such that the number of divisors of n is floor(log(n)).
 * @author Sean A. Irvine
 */
public class A067283 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma0().equals(CR.valueOf(mN).log().floor())) {
        return Z.valueOf(mN);
      }
    }
  }
}
