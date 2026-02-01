package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390236 Numbers k such that sigma(k) = psi(k) + pi(k) + omega(k)^3.
 * @author Sean A. Irvine
 */
public class A392909 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.PRIME_PI.z(mN)).add(Functions.OMEGA.z(mN).pow(6)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
