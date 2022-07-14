package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;
import irvine.util.string.StringUtils;

/**
 * A057959 Sum of composite numbers up to n is palindromic.
 * @author Sean A. Irvine
 */
public class A057959 extends A002808 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(super.next());
      if (StringUtils.isPalindrome(mSum.toString())) {
        return mN;
      }
    }
  }
}
