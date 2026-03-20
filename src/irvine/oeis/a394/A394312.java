package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394312 Numbers k such that sigma(k) = psi(k) + pi(k) + Omega(k)^5.
 * @author Sean A. Irvine
 */
public class A394312 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.PRIME_PI.z(mN)).add(Functions.BIG_OMEGA.z(mN).pow(5)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
