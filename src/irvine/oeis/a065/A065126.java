package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065126 Numbers n for which sigma_2(n^2) == 3 (mod 10).
 * @author Sean A. Irvine
 */
public class A065126 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).square().sigma2().mod(10) == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}

