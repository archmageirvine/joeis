package irvine.oeis.a387;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A387199 Numbers which are not themselves palindromes, but a single swap of two digits creates a palindrome.
 * @author Sean A. Irvine
 */
public class A387199 extends Sequence1 {

  private long mN = 109;

  private boolean is(final long n) {
    if (Predicates.PALINDROME.is(n)) {
      return false;
    }
    final String s = String.valueOf(n);
    for (int k = 1; k < s.length(); ++k) {
      for (int j = 0; j < k; ++j) {
        if (s.charAt(k) != s.charAt(j)) {
          final String t = s.substring(0, j) + s.charAt(k) + s.substring(j + 1, k) + s.charAt(j) + s.substring(k + 1);
          if (t.charAt(0) != '0' && StringUtils.isPalindrome(t)) {
            return true;
          }
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

