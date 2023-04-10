package irvine.oeis.a062;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062843 Maximum number of ones in the representation of n in any base.
 * @author Sean A. Irvine
 */
public class A062843 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long max = 1;
    for (int base = 2; LongUtils.pow(base, max) < mN; ++base) {
      final int ones = ZUtils.digitCounts(mN, base)[1];
      if (ones > max) {
        max = ones;
      }
    }
    return Z.valueOf(max);
  }
}
