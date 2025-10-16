package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081210.
 * @author Sean A. Irvine
 */
public class A387819 extends Sequence1 {

  private long mN = 0;

  private long search(final long n) {
    if (n < 10) {
      return n;
    }
    long min = n;
    final String s = String.valueOf(n);
    for (int k = 0; k < s.length() - 1; ++k) {
      if (s.charAt(k) != '0') {
        for (int j = k + 2; j <= s.length(); ++j) {
          final long sub = Long.parseLong(s.substring(k, j));
          for (int d = 2; d < 10; ++d) {
            if (sub % d == 0) {
              min = Math.min(min, search(Long.parseLong(s.substring(0, k) + sub / d + s.substring(j))));
            }
          }
        }
      }
    }
    return min;
  }

  @Override
  public Z next() {
    return Z.valueOf(search(++mN));
  }
}
