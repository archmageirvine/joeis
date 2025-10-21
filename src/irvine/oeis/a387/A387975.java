package irvine.oeis.a387;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387975 Number of distinct positive integers reachable from n by successively dividing any contiguous substring of at least two digits by an integer d in 2..9, including n itself.
 * @author Sean A. Irvine
 */
public class A387975 extends Sequence1 {

  private long mN = 0;

  private void search(final HashSet<Long> set, final long n) {
    set.add(n);
    if (n < 10) {
      return;
    }
    final String s = String.valueOf(n);
    for (int k = 0; k < s.length() - 1; ++k) {
      if (s.charAt(k) != '0') {
        for (int j = k + 2; j <= s.length(); ++j) {
          final long sub = Long.parseLong(s.substring(k, j));
          for (int d = 2; d < 10; ++d) {
            if (sub % d == 0) {
              final long v = Long.parseLong(s.substring(0, k) + sub / d + s.substring(j));
              search(set, v);
            }
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    final HashSet<Long> set = new HashSet<>();
    search(set, ++mN);
    return Z.valueOf(set.size());
  }
}
