package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A075049 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final int[] cnts = ZUtils.digitCounts(n);
    if (cnts[0] > 0) {
      return false;
    }
    for (int k = 2; k < cnts.length; ++k) {
      if ((cnts[k] > 0) == (n % k != 0)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

