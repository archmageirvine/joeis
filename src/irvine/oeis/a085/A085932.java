package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A085932 Numbers n such that the digits sorted in ascending order + the digital sum of n is a palindrome. Or, sortdigits(n)+digit sum(n) is a palindrome.
 * @author Georg Fischer
 */
public class A085932 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z mK = ZUtils.sortDigitsAscending(mN).add(ZUtils.digitSum(mN));
      if (StringUtils.isPalindrome(mK.toString())) {
        return mN;
      }
    }
  }
}
