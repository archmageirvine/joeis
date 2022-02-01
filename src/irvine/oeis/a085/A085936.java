package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A085936 Numbers n such that the digits sorted in ascending order + the sum of the squares of the digits of n is a palindrome. Or, sortdigits(n)+digitsumsquare(n) is a palindrome.
 * @author Georg Fischer
 */
public class A085936 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(ZUtils.sortDigitsAscending(mN).add(ZUtils.digitSumSquares(mN)).toString())) {
        return mN;
      }
    }
  }
}
