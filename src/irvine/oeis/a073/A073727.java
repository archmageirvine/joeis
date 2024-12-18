package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A073727 Number of distinct-digit integers between squares.
 * @author Sean A. Irvine
 */
public class A073727 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN >= 31427) {
      return Z.ZERO;
    }
    long cnt = 0;
    for (long k = mN * mN + 1; k < (mN + 1) * (mN + 1); ++k) {
      if (Functions.MAX.l(ZUtils.digitCounts(k)) <= 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
