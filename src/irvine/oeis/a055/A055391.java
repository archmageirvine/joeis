package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;
import irvine.util.string.StringUtils;

/**
 * A055391 Palindromic Lucas numbers.
 * @author Sean A. Irvine
 */
public class A055391 extends A000032 {

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
