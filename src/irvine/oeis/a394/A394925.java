package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394925 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A394925 extends Sequence1 {

  private long mN = 10935;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.SIGMA0.z(mN)).add(Functions.BIG_OMEGA.z(mN).pow(6)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
