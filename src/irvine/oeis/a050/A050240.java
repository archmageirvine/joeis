package irvine.oeis.a050;

import java.util.Arrays;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050240 Powerful numbers (A007532) representable in two distinct ways (not counting different powers of duplicated digits as distinct).
 * @author Sean A. Irvine
 */
public class A050240 implements Sequence {

  // todo: this is currently wrong, definition in OEIS unclear?

  private long mN = 0;

  private long countPowerful(final long n, final String s, final int pos, final long[] powers) {
    assert n >= 0;
    if (pos == s.length()) {
      if (n == 0) {
        System.out.println(Arrays.toString(powers));
      }
      return n == 0 ? 1 : 0;
    }
    final int v = s.charAt(pos) - '0';
    if (v <= 1) {
      return countPowerful(n - v, s, pos + 1, powers);
    }
    long cnt = 0;
    final long t = powers[v];
    while (powers[v] <= n) {
      final long c = countPowerful(n - powers[v], s, pos + 1, powers);
      cnt += c;
//        if (cnt > 1) {
//          return cnt;
//        }
      powers[v] *= v;
    }
    powers[v] = t;
    return cnt;
  }

  private boolean isPowerful(final long n) {
    final long[] powers = new long[10];
    LongUtils.identity(powers);
    return countPowerful(n, String.valueOf(n), 0, powers) == 2;
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
