package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394609 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A394609 extends Sequence1 {

  private long mN = 107;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.PRIME_PI.z(mN)).add(Functions.PHI.z(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
