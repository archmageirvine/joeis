package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A057136 Palindromes whose square root is a palindrome.
 * @author Sean A. Irvine
 */
public class A057136 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next().square();
      if (StringUtils.isPalindrome(palin.toString())) {
        return palin;
      }
    }
  }
}
