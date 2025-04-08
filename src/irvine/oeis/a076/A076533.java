package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076533 Numbers n such that sum of the distinct prime factors of phi(n) = sum of the distinct prime factors of sigma(n).
 * @author Sean A. Irvine
 */
public class A076533 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.z(Functions.PHI.l(++mN)).equals(Functions.SOPF.z(Functions.SIGMA1.z(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
