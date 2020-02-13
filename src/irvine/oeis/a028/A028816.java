package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028816 Numbers n such that <code>n^2</code> is a palindrome with an odd number of digits.
 * @author Sean A. Irvine
 */
public class A028816 implements Sequence {

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
