package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;

/**
 * A394749 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A394749 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (int b = 2; b < mN; ++b) {
      final int[] cnts = ZUtils.digitCounts(mN, b);
      if (cnts[0] == 0) {
        Z g = Z.ZERO;
        for (int k = 1; k < cnts.length; ++k) {
          if (cnts[k] > 0) {
            g = g.gcd(k);
          }
        }
        max = max.max(g);
      }
    }
    return max;
  }
}
