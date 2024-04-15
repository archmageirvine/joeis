package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067679 Numbers m such that sigma(4m+5) = 6m.
 * @author Sean A. Irvine
 */
public class A067679 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(4 * ++mN + 5).longValueExact() == 6 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
