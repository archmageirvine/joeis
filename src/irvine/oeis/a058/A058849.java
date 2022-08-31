package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a071.A071904;
import irvine.util.string.StringUtils;

/**
 * A058849 Sum of odd composites up to n is palindromic.
 * @author Sean A. Irvine
 */
public class A058849 extends A071904 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      mN = mN.add(t);
      if (StringUtils.isPalindrome(mN.toString())) {
        return t;
      }
    }
  }
}
