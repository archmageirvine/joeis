package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a036.A036275;
import irvine.util.string.StringUtils;

/**
 * A086883 Numbers n such that the decimal expansion of 1/n is nonterminating and contains arbitrarily long palindromic substrings.
 * @author Sean A. Irvine
 */
public class A086883 extends A036275 {

  private static final Z Z100 = Z.valueOf(100);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (p.isZero()) {
        continue;
      }
      if (p.compareTo(Z100) < 0 || Predicates.PALINDROME.is(p)) {
        return Z.valueOf(mN);
      }
      String s = p.toString();
      if (StringUtils.isPalindrome(s.substring(1))) {
        // e.g. 91 -> (109890)(109890)
        return Z.valueOf(mN);
      }
      if (StringUtils.isPalindrome(s.substring(0, s.length() - 1))) {
        // e.g. 182 -> (549450)(549450)...
        return Z.valueOf(mN);
      }
      for (int k = 1; k < s.length(); ++k) {
        s = s.substring(1) + s.charAt(0);
        if (StringUtils.isPalindrome(s)) {
          // e.g. 111 -> (900)(900)... -> 90(090)(090)...
          return Z.valueOf(mN);
        }
      }
    }
  }
}

