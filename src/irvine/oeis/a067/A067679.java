package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
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
      if (Jaguar.factor(4 * ++mN + 5).sigma().longValueExact() == 6 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
