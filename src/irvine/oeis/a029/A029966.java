package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A029966 Palindromic in bases 10 and 11.
 * @author Sean A. Irvine
 */
public class A029966 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString(11))) {
        return t;
      }
    }
  }
}
