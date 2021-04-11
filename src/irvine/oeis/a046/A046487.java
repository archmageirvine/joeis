package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A046487 Palindromes k such that the sum of the first palindromes up to k is a palindrome.
 * @author Sean A. Irvine
 */
public class A046487 extends A002113 {

  private Z mSum = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      mSum = mSum.add(t);
      if (StringUtils.isPalindrome(mSum.toString())) {
        return t;
      }
    }
  }
}
