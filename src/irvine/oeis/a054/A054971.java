package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000566;
import irvine.util.string.StringUtils;

/**
 * A054971 n(5n-3)/2 is a palindromic heptagonal number.
 * @author Sean A. Irvine
 */
public class A054971 extends A000566 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z hex = super.next();
      if (StringUtils.isPalindrome(hex.toString())) {
        return mN;
      }
    }
  }
}
