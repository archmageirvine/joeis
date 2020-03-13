package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A029963 Palindromic in bases 6 and 10.
 * @author Sean A. Irvine
 */
public class A029963 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString(6))) {
        return t;
      }
    }
  }
}
