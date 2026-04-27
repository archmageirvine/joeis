package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395142 Numbers k such that sigma(k) = psi(k) + tau(k) + Omega(k)^10.
 * @author Sean A. Irvine
 */
public class A395142 extends Sequence1 {

  private long mN = 21845374;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.SIGMA0.z(mN)).add(Functions.BIG_OMEGA.z(mN).pow(10)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
