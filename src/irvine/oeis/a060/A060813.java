package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A060813 Numbers whose square has more than 2/3 of its digits the same.
 * @author Sean A. Irvine
 */
public class A060813 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final int[] cnts = ZUtils.digitCounts(n.square());
      int max = 0;
      int s = 0;
      for (final int v : cnts) {
        s += v;
        if (v > max) {
          max = v;
        }
      }
      if (3 * max > 2 * s) {
        return n;
      }
    }
  }
}
