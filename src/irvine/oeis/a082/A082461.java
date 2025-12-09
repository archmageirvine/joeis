package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A082461 Non-palindromic numbers whose decimal expansion is a concatenation of the form a_1 a_2 a_3 ... a_{k-1} a_k a_k a_{k-1} ... a_2 a_1 (k &gt;= 1) or a_1 a_2 a_3 ... a_{k-1} a_k a_{k-1} ... a_2 a_1 (k &gt;= 2) for positive integers a_1, ..., a_k. For i&gt;1, a_i may have leading zeros.
 * @author Sean A. Irvine
 */
public class A082461 extends Sequence1 {

  private long mN = 1009;

  private boolean is(final long n) {
    if (n < 10) {
      return true;
    }
    if (Predicates.PALINDROME.is(n)) {
      return false;
    }
    final String s = String.valueOf(n);
    for (int k = 1; 2 * k <= s.length(); ++k) {
      if (s.endsWith(s.substring(0, k))) {
        if (2 * k == s.length()) {
          return true;
        }
        final String sub = s.substring(k, s.length() - k);
        if (sub.length() == 1) {
          return true;
        }
        if (!StringUtils.isPalindrome(sub)) {
          return true;
        }
        if (sub.length() > 2 && is(Long.parseLong(sub))) {
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

