package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000326;
import irvine.util.string.StringUtils;

/**
 * A002069 Palindromic pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A002069 extends A000326 {

  @Override
  public Z next() {
    Z v;
    do {
      v = super.next();
    } while (!StringUtils.isPalindrome(v.toString()));
    return v;
  }
}

