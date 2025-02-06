package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A075049 Numbers k such that every digit of k is a divisor of k and every divisor of k in the range [2,9] occurs at least once as a digit of k.
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

