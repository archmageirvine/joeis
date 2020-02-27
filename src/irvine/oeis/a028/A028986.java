package irvine.oeis.a028;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A028986 Palindromes whose sum of divisors is palindromic.
 * @author Sean A. Irvine
 */
public class A028986 extends A002113 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (StringUtils.isPalindrome(Cheetah.factor(p).sigma().toString())) {
        return p;
      }
    }
  }
}
