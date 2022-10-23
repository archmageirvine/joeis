package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A039820 Numbers whose square contains the same digit more than 2/3 of the time and does not end in 0.
 * @author Sean A. Irvine
 */
public class A039820 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      if (s.mod(10) != 0) {
        final int[] cnts = ZUtils.digitCounts(s);
        int max = 0;
        int sum = 0;
        for (final int c : cnts) {
          sum += c;
          if (c > max) {
            max = c;
          }
        }
        if (3 * max > 2 * sum) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
