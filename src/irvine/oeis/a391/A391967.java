package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391967 Numbers k such that sigma(k) + phi(k) = psi(k) + k.
 * @author Sean A. Irvine
 */
public class A391967 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).add(Functions.PHI.l(mN)).equals(Functions.DEDEKIND_PSI.z(mN).add(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
