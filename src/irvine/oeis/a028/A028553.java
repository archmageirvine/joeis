package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A028553 Numbers k such that k*(k+3) is a palindrome.
 * @author Sean A. Irvine
 */
public class A028553 extends Sequence1 {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.multiply(mN.add(3)).toString())) {
        return mN;
      }
    }
  }
}
