package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A085934 Numbers n such that the digits sorted in ascending order + the digital product of n is a palindrome. Or, sortdigits(n)+ digitproduct(n) is a palindrome.
 * @author Georg Fischer
 */
public class A085934 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(Functions.DIGIT_SORT_ASCENDING.z(mN).add(Functions.DIGIT_PRODUCT.z(mN)).toString())) {
        return mN;
      }
    }
  }
}
