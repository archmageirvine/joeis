package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023743 Base 5 expansion uses each positive digit just once.
 * @author Sean A. Irvine
 */
public class A023743 implements Sequence {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      final long r = n % 5;
      if (r > 0) {
        final int bit = 1 << (r - 1);
        if ((c & bit) != 0) {
          return false;
        }
        c |= bit;
      }
      n /= 5;
    }
    return c == 15;
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

