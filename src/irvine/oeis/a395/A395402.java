package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394658 Numbers k such that sigma(k) = psi(k) + tau(k) + Omega(k)^2.
 * @author Sean A. Irvine
 */
public class A395402 extends Sequence1 {

  private long mN = 351;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.SIGMA0.z(mN).square()).add(Functions.BIG_OMEGA.z(mN).square()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
