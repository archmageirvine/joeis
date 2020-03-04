package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A029731 Palindromic in bases 10 and 16.
 * @author Sean A. Irvine
 */
public class A029731 extends A029730 {

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
