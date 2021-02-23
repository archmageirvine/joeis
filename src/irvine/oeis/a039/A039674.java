package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A039674 Palindromic Fibonacci-lucky numbers.
 * @author Sean A. Irvine
 */
public class A039674 extends A039672 {

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
