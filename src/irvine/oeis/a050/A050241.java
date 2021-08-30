package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050241 Handsome numbers (A007532) representable in exactly two distinct ways (counting different powers of duplicated digits as distinct).
 * @author Sean A. Irvine
 */
public class A050241 implements Sequence {

  private long mN = 0;

  private long isPowerful(final long n, final String s, final int pos) {
    assert n >= 0;
    if (pos == s.length()) {
      return n == 0 ? 1 : 0;
    }
    final long v = s.charAt(pos) - '0';
    if (v <= 1) {
      return isPowerful(n - v, s, pos + 1);
    }
    long u = v;
    long cnt = 0;
    while (u <= n) {
      cnt += isPowerful(n - u, s, pos + 1);
      if (cnt > 2) {
        return cnt;
      }
      u *= v;
    }
    return cnt;
  }

  private boolean isPowerful(final long n) {
    return isPowerful(n, String.valueOf(n), 0) == 2;
  }

  @Override
  public Z next() {
    while (true) {
      if (isPowerful(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
