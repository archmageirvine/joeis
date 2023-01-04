package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A060811 Numbers whose square has a majority of one digit.
 * @author Sean A. Irvine
 */
public class A060811 extends Sequence1 {

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
      if (2 * max > s) {
        return n;
      }
    }
  }
}
