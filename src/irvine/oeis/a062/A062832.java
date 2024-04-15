package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062832 Numbers k such that k and k+2 have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A062832 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(++mN).equals(Functions.SIGMA0.z(mN + 2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
