package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A051004 Numbers divisible both by their individual digits and by the sum of their digits.
 * @author Sean A. Irvine
 */
public class A051004 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    outer:
    while (true) {
      final int[] cnts = ZUtils.digitCounts(++mN);
      if (cnts[0] > 0) {
        continue;
      }
      for (int k = 2; k < cnts.length; ++k) {
        if (cnts[k] > 0 && mN % k != 0) {
          continue outer;
        }
      }
      if (mN % ZUtils.digitSum(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
