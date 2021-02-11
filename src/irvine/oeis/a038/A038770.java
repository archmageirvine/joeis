package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038770 Numbers divisible by at least one of their digits.
 * @author Sean A. Irvine
 */
public class A038770 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] cnts = ZUtils.digitCounts(mN);
      for (int k = 1; k < cnts.length; ++k) {
        if (cnts[k] > 0 && mN.mod(k) == 0) {
          return mN;
        }
      }
    }
  }
}
