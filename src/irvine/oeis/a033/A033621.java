package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A033621 n-1 is a palindrome in base 10, n+1 is a palindrome in base 17.
 * @author Sean A. Irvine
 */
public class A033621 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (StringUtils.isPalindrome(a.add(2).toString(17))) {
        return a.add(1);
      }
    }
  }
}
