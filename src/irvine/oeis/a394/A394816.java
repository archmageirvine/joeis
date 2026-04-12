package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394816 Numbers k such that sigma(k) = psi(k) + tau(k) + Omega(k)^5.
 * @author Sean A. Irvine
 */
public class A394816 extends Sequence1 {

  private long mN = 3795;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.SIGMA0.z(mN)).add(Functions.BIG_OMEGA.z(mN).pow(5)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
