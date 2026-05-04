package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395550 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A395550 extends Sequence1 {

  private long mN = 14266340;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.SIGMA0.z(mN).pow(7)).add(Functions.BIG_OMEGA.z(mN).pow(7)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
