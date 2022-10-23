package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038810 a(n) is the number of ways to write the number n as dk...di...d2d1d0 where digit di represents di * (di+1)^i, restricting di to 0..9.
 * @author Sean A. Irvine
 */
public class A038810 extends Sequence0 {

  private long mN = -1;

  private int search(final long n, final int k) {
    if (n == 0) {
      return 1;
    }
    int c = 0;
    for (long d = 0; d < 10; ++d) {
      final long t = d * LongUtils.pow(d + 1, k);
      if (t > n) {
        break;
      }
      if (k <= LongUtils.lg(n)) {
        c += search(n - t, k + 1);
      }
    }
    return c;
  }

  @Override
  public Z next() {
    return Z.valueOf(search(++mN, 0));
  }
}
