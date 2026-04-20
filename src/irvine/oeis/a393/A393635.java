package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393635 Numbers k such that sigma(k) = psi(k) + tau(k) + Omega(k)^9.
 * @author Sean A. Irvine
 */
public class A393635 extends Sequence1 {

  private long mN = 699063;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.SIGMA0.z(mN)).add(Functions.BIG_OMEGA.z(mN).pow(9)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
