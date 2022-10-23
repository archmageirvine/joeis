package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059307 Numbers n such that base 10 representation of n does not contain a block of digits which is a square: blocks like 0, 1, 4, 9, 36, 121, ... are forbidden.
 * @author Sean A. Irvine
 */
public class A059307 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    final String decimal = String.valueOf(n);
    for (long s = 0; s * s <= n; ++s) {
      if (decimal.contains(String.valueOf(s * s))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
