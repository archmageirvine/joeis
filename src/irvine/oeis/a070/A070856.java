package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070837.
 * @author Sean A. Irvine
 */
public class A070856 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.l(Functions.REVERSE.l(++mN)) == Functions.PHI.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
