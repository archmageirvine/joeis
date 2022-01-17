package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;
import irvine.util.string.StringUtils;

/**
 * A053779 Numbers k such that the sum of the first k composite numbers is palindromic.
 * @author Sean A. Irvine
 */
public class A053779 extends A002808 {

  private long mN = 0;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(super.next());
      ++mN;
      if (StringUtils.isPalindrome(mA.toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}
