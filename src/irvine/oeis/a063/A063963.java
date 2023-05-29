package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063963 Numbers k such that k and k+2540 have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A063963 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma0().equals(Jaguar.factor(mN + 2540).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}

