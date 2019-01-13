package irvine.oeis.a162;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A162537.
 * @author Sean A. Irvine
 */
public class A162537 implements Sequence {

  private long mN = 0;

  private static boolean test(final Z v, final long n) {
    final String s = v.toString(2);
    char c = s.charAt(0);
    long cnt = 1;
    for (int k = 1; k < s.length(); ++k) {
      final char d = s.charAt(k);
      if (d == c) {
        ++cnt;
      } else {
        if (LongUtils.gcd(n, cnt) != 1) {
          return false;
        }
        c = d;
        cnt = 1;
      }
    }
    return LongUtils.gcd(n, cnt) == 1;
  }

  @Override
  public Z next() {
    ++mN;
    Z v = Z.valueOf(mN);
    while (true) {
      if (test(v, mN)) {
        return v;
      }
      v = v.add(mN);
    }
  }
}

