package irvine.oeis.a059;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059469 Numbers that are the products of distinct substrings of themselves.
 * @author Sean A. Irvine
 */
public class A059469 extends Sequence1 {

  private long mN = 109;

  private long[] substrings(final long n) {
    final String s = String.valueOf(n);
    final HashSet<String> h = new HashSet<>();
    for (int start = 0; start < s.length(); ++start) {
      if (s.charAt(start) != '0') {
        for (int end = start + 1; end <= s.length(); ++end) {
          h.add(s.substring(start, end));
        }
      }
    }
    h.remove(s);
    h.remove("1");
    final long[] res = new long[h.size()];
    int k = 0;
    for (final String v : h) {
      res[k++] = Long.parseLong(v);
    }
    return res;
  }

  private boolean isSolvable(final long[] substrings, final long n, final long prod, final int pos) {
    if (prod >= n) {
      return prod == n;
    }
    if (pos >= substrings.length) {
      return false;
    }
    return isSolvable(substrings, n, prod * substrings[pos], pos + 1)
      || isSolvable(substrings, n, prod, pos + 1);
  }

  @Override
  public Z next() {
    while (true) {
      final long[] substrings = substrings(++mN);
      if (isSolvable(substrings, mN, 1, 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}
