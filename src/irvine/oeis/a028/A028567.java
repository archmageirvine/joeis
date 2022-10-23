package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A028567 Numbers k such that k*(k+8) is a palindrome.
 * @author Sean A. Irvine
 */
public class A028567 extends Sequence1 {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.multiply(mN.add(8)).toString())) {
        return mN;
      }
    }
  }
}
