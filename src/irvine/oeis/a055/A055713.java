package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055713 Numbers k such that k | sigma_9(k).
 * @author Sean A. Irvine
 */
public class A055713 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma(9).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
