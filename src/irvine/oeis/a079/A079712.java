package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079712 Numbers m such that bigomega(m) = 3*omega(m).
 * @author Sean A. Irvine
 */
public class A079712 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == 3 * Functions.OMEGA.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

