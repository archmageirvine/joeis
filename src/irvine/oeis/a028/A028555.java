package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028555 Numbers k such that k*(k+4) is a palindrome.
 * @author Sean A. Irvine
 */
public class A028555 implements Sequence {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.multiply(mN.add(4)).toString())) {
        return mN;
      }
    }
  }
}
