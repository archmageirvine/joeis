package irvine.oeis.a063;

import irvine.math.function.Functions;
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
      if (Functions.SIGMA0.z(++mN).equals(Functions.SIGMA0.z(mN + 2540))) {
        return Z.valueOf(mN);
      }
    }
  }
}

