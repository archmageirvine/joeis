package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392053 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A392053 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.PRIME_PI.z(mN)).add(Functions.OMEGA.z(mN).pow(4)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
