package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074835 Numbers n such that sigma(phi(n)) = sum of anti-divisors of n.
 * @author Sean A. Irvine
 */
public class A074835 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(Functions.PHI.l(++mN)).equals(Functions.ANTISIGMA1.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
