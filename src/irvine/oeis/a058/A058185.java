package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058185 Numbers (written in decimal) which appear the same when written in base 5 and base 10/2.
 * @author Sean A. Irvine
 */
public class A058185 extends Sequence0 {

  private long mN = -1;

  private boolean is(final long n) {
    long f = n;
    long h = n;
    while (f != 0 || h != 0) {
      if (f % 5 != h % 10) {
        return false;
      }
      f /= 5;
      h /= 10;
      h *= 2;
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
