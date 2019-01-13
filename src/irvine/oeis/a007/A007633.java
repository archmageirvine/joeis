package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A007633.
 * @author Sean A. Irvine
 */
public class A007633 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (StringUtils.isPalindrome(p.toString(3))) {
        return p;
      }
    }
  }
}
