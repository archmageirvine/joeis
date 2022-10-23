package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055714 Numbers n such that n | sigma_10(n).
 * @author Sean A. Irvine
 */
public class A055714 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma(10).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
