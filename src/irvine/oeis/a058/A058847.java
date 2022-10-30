package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a071.A071148;
import irvine.util.string.StringUtils;

/**
 * A058847 Palindromes that are the sum of consecutive initial odd primes.
 * @author Sean A. Irvine
 */
public class A058847 extends A071148 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString())) {
        return t;
      }
    }
  }
}
