package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a001.A001106;
import irvine.util.string.StringUtils;

/**
 * A055560 Base numbers of 9-gonal palindromic numbers.
 * @author Sean A. Irvine
 */
public class A055560 extends A001106 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (!StringUtils.isPalindrome(super.next().toString())) {
      // do nothing
    }
    return mN;
  }
}
