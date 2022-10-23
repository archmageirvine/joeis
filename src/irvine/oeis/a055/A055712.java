package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055712 Numbers k such that k | sigma_8(k).
 * @author Sean A. Irvine
 */
public class A055712 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma(8).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
