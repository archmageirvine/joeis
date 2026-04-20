package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393481 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A393481 extends Sequence1 {

  private long mN = 4285699;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.DEDEKIND_PSI.z(mN).add(Functions.SIGMA0.z(mN)).add(Functions.BIG_OMEGA.z(mN).pow(8)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
