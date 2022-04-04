package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055713 Numbers k such that k | sigma_9(k).
 * @author Sean A. Irvine
 */
public class A055713 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sigma(9).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
