package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395404 Numbers k such that sigma(k) = psi(k) + tau(k)^4 + Omega(k)^4.
 * @author Sean A. Irvine
 */
public class A395404 extends Sequence1 {

  private long mN = 29348;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.SIGMA0.z(mN).pow(4)).add(Functions.BIG_OMEGA.z(mN).pow(4)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
