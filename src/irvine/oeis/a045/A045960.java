package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A045960 Palindromic even lucky numbers.
 * @author Sean A. Irvine
 */
public class A045960 extends A045954 {

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
