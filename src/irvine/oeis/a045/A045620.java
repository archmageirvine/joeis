package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A045620 Numbers k such that digits of k^3 include digits of k^2.
 * @author Sean A. Irvine
 */
public class A045620 extends Sequence1 {

  private long mN = -1;

  private boolean is(final int[] d2, final int[] d3) {
    for (int k = 0; k < d2.length; ++k) {
      if (d2[k] > d3[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n2 = Z.valueOf(++mN).square();
      final Z n3 = n2.multiply(mN);
      final int[] d2 = ZUtils.digitCounts(n2);
      final int[] d3 = ZUtils.digitCounts(n3);
      if (is(d2, d3)) {
        return Z.valueOf(mN);
      }
    }
  }
}
