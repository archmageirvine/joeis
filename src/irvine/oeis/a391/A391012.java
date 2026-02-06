package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391012 Numbers k such that 2*k and k + 2 have same sum of divisors.
 * @author Sean A. Irvine
 */
public class A391012 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(2 * ++mN).equals(Functions.SIGMA1.z(mN + 2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
