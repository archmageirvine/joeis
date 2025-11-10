package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390330 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A390330 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if ((Functions.OMEGA.i(Binomial.binomial(2 * ++mN, mN)) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

