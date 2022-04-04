package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055712 Numbers k such that k | sigma_8(k).
 * @author Sean A. Irvine
 */
public class A055712 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sigma(8).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
