package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070763.
 * @author Sean A. Irvine
 */
public class A070763 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.l(Functions.SIGMA.z(++mN)) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
