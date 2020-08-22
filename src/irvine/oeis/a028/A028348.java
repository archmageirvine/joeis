package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028348 Numbers n such that n^2 + 3*n + 1 is a palindrome.
 * @author Sean A. Irvine
 */
public class A028348 implements Sequence {

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
