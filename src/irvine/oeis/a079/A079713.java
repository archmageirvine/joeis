package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079713 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(Functions.SIGMA1.z(++mN)) == Functions.SIGMA1.l(Functions.BIG_OMEGA.l(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

