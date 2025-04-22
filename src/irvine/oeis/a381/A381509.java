package irvine.oeis.a381;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A381509 Numbers whose nonzero digits are in nondecreasing order and any zeros appear at the end.
 * @author Sean A. Irvine
 */
public class A381509 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final int[] cnts = ZUtils.digitCounts(++mN);
      long v = 0;
      for (int k = 1; k < 9; ++k) {
        for (int j = 0; j < cnts[k]; ++j) {
          v *= 10;
          v += k;
        }
      }
      for (int j = 0; j < cnts[0]; ++j) {
        v *= 10;
      }
      if (v == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
