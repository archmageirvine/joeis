package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055716 Numbers n such that n | sigma_12(n).
 * @author Sean A. Irvine
 */
public class A055716 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma(12).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
