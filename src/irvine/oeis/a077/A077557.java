package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A077557 a(1)=1, a(n+1) &gt; a(n) and differs by at most one digit.
 * @author Sean A. Irvine
 */
public class A077557 extends Sequence1 {

  private long mN = 0;

  private boolean is(final int[] cnts, final long v) {
    final int[] t = ZUtils.digitCounts(v);
    int diffDigits = 0;
    for (int k = 0; k < cnts.length; ++k) {
      final int d = Math.abs(cnts[k] - t[k]);
      if (d > 1) {
        return false;
      } else if (d == 1 && ++diffDigits > 2) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(mN);
    while (true) {
      if (is(cnts, ++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
