package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383489.
 * @author Sean A. Irvine
 */
public class A383230 extends Sequence1 {

  private long mN = 196;

  private boolean is(final long n, long a, long b, long c) {
    while (c < n) {
      final long t = a + b + c;
      a = b;
      b = c;
      c = t;
    }
    return c == n;
  }

  private boolean is(final long n) {
    final String s = String.valueOf(n);
    for (int k = 1; k < s.length() - 1; ++k) {
      for (int j = k + 1; j < s.length(); ++j) {
        if (is(n, Long.parseLong(s.substring(0, k)), Long.parseLong(s.substring(k, j)), Long.parseLong(s.substring(j)))) {
          return true;
        }
      }
    }
    return false;
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

