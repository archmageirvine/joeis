package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A060814 Numbers whose cubes contain more than half the same digit and do not end in 0.
 * @author Sean A. Irvine
 */
public class A060814 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 != 0) {
        final Z n = Z.valueOf(mN);
        final int[] cnts = ZUtils.digitCounts(n.pow(3));
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
}
