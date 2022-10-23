package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A028348 Numbers k such that k^2 + 3*k + 1 is a palindrome.
 * @author Sean A. Irvine
 */
public class A028348 extends Sequence1 {

  private Z mN = Z.ZERO;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z u = mN.add(3).multiply(mN).add(1);
      if (StringUtils.isPalindrome(u.toString())) {
        return mN;
      }
    }
  }
}
