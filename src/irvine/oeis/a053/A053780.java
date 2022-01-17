package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;
import irvine.util.string.StringUtils;

/**
 * A053780 Palindromes arising in A053779.
 * @author Sean A. Irvine
 */
public class A053780 extends A002808 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(super.next());
      if (StringUtils.isPalindrome(mA.toString())) {
        return mA;
      }
    }
  }
}
