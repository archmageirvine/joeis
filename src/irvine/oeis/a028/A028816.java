package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A028816 Numbers k such that k^2 is a palindrome with an odd number of digits.
 * @author Sean A. Irvine
 */
public class A028816 extends Sequence1 {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.square().toString();
      if ((s.length() & 1) == 1 && StringUtils.isPalindrome(s)) {
        return mN;
      }
    }
  }
}
