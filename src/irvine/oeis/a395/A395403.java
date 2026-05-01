package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395403 Numbers k such that sigma(k) = psi(k) + tau(k)^3 + Omega(k)^3.
 * @author Sean A. Irvine
 */
public class A395403 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.SIGMA0.z(mN).pow(3)).add(Functions.BIG_OMEGA.z(mN).pow(3)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
