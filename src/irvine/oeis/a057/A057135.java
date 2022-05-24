package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A057135 Palindromes whose square is a palindrome; also palindromes whose sum of squares of digits is less than 10.
 * @author Sean A. Irvine
 */
public class A057135 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      if (StringUtils.isPalindrome(palin.square().toString())) {
        return palin;
      }
    }
  }
}
