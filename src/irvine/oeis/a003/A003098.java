package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;
import irvine.util.string.StringUtils;

/**
 * A003098 Palindromic triangular numbers.
 * @author Sean A. Irvine
 */
public class A003098 extends A000217 {

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
