package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a002.A002378;
import irvine.util.string.StringUtils;

/**
 * A056794 Numbers n such that n*(n-1) is an oblong (promic, A002378) palindrome.
 * @author Sean A. Irvine
 */
public class A056794 extends A002378 {

  @Override
  public Z next() {
    while (true) {
      if (StringUtils.isPalindrome(super.next().toString())) {
        return mN;
      }
    }
  }
}
