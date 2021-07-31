package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028558 Numbers k such that k*(k+5) is a palindrome.
 * @author Sean A. Irvine
 */
public class A028558 implements Sequence {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.multiply(mN.add(5)).toString())) {
        return mN;
      }
    }
  }
}
