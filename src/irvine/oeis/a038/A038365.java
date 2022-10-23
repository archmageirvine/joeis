package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A038365 Numbers n with property that digits of n are not present in 2n.
 * @author Sean A. Irvine
 */
public class A038365 extends Sequence1 {

  private long mN = 0;

  private boolean isOk(final int[] c, final int[] d) {
    for (int k = 0; k < c.length; ++k) {
      if (c[k] > 0 && d[k] > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (isOk(ZUtils.digitCounts(n), ZUtils.digitCounts(n.multiply2()))) {
        return n;
      }
    }
  }
}
