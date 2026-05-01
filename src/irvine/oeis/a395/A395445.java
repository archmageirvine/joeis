package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395445 Numbers k such that sigma(k) = psi(k) + tau(k)^5 + Omega(k)^5.
 * @author Sean A. Irvine
 */
public class A395445 extends Sequence1 {

  private long mN = 228068;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.SIGMA0.z(mN).pow(5)).add(Functions.BIG_OMEGA.z(mN).pow(5)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
