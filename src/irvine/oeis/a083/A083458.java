package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A083458 Numbers n such that n^5 + 1 is a palindrome.
 * @author Georg Fischer
 */
public class A083458 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.pow(5).add(1).toString())) {
        return mN;
      }
    }
  }
}
