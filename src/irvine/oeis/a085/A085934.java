package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A085934 Numbers n such that the digits sorted in ascending order + the digital product of n is a palindrome. Or, sortdigits(n)+ digitproduct(n) is a palindrome.
 * @author Georg Fischer
 */
public class A085934 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(ZUtils.sortDigitsAscending(mN).add(ZUtils.digitProduct(mN)).toString())) {
        return mN;
      }
    }
  }
}
