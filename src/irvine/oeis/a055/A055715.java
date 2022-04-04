package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055715 Numbers k such that k | sigma_11(k).
 * @author Sean A. Irvine
 */
public class A055715 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sigma(11).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
