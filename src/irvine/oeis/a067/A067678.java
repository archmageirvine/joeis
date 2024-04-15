package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067678 Numbers m such that sigma(4*m+3) = 6*m.
 * @author Sean A. Irvine
 */
public class A067678 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.l(4 * ++mN + 3) == 6 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
