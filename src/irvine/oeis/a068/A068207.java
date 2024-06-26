package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068207 Numbers k such that the number of divisors of k^2-1 equals the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A068207 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.z(++mN).equals(Functions.SIGMA0.z(mN * mN - 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
