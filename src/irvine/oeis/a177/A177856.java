package irvine.oeis.a177;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A177856 Numbers m such that m*reversal(m)+1 is a palindrome.
 * @author Georg Fischer
 */
public class A177856 implements Sequence {

  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (StringUtils.isPalindrome(mK.multiply(ZUtils.reverse(mK)).add(1).toString())) {
        return mK;
      }
    }
  }
}
