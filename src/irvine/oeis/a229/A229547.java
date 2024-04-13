package irvine.oeis.a229;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A229547 Numbers n such that n - product_of_digits(n) is a palindrome.
 * @author Georg Fischer
 */
public class A229547 extends Sequence1 {

  private Z mK = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (StringUtils.isPalindrome(mK.subtract(Functions.DIGIT_PRODUCT.z(mK)).toString())) {
        return mK;
      }
    }
  }
}
