package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061859.
 * @author Sean A. Irvine
 */
public class A061862 extends Sequence1 {

  private long mN = -1;

  private boolean is(final long remaining, final long t) {
    if (t == 0) {
      return remaining == 0;
    }
    if (remaining == 0) {
      return false;
    }
    final long digit = t % 10;
    final long r = t / 10;
    if (digit <= 1) {
      return is(remaining - digit, r);
    } else {
      for (long d = 1; d <= remaining; d *= digit) {
        if (is(remaining - d, r)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
