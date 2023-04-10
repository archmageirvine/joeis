package irvine.oeis.a062;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062842 Maximum number of zeros in the representation of n in any base.
 * @author Sean A. Irvine
 */
public class A062842 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    for (int base = 2; LongUtils.pow(base, max) < mN; ++base) {
      final int zeros = ZUtils.digitCounts(mN, base)[0];
      if (zeros > max) {
        max = zeros;
      }
    }
    return Z.valueOf(max);
  }
}
