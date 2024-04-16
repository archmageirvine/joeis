package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A085936 Numbers n such that the digits sorted in ascending order + the sum of the squares of the digits of n is a palindrome. Or, sortdigits(n)+digitsumsquare(n) is a palindrome.
 * @author Georg Fischer
 */
public class A085936 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(Functions.DIGIT_SORT_ASCENDING.z(mN).add(Functions.DIGIT_SUM_SQUARES.l(mN)).toString())) {
        return mN;
      }
    }
  }
}
