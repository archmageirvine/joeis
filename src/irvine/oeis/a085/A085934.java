package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A085934 Numbers k such that (digits of k sorted in ascending order) + (digital product of k) is a palindrome. Or, sortdigits(k) + digitproduct(k) is a palindrome.
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
