package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055708 Numbers n such that n - 1 | sigma(n).
 * @author Sean A. Irvine
 */
public class A055708 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sigma().mod(mN - 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
