package irvine.oeis.a177;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A177856 Numbers m such that m*reversal(m)+1 is a palindrome.
 * @author Georg Fischer
 */
public class A177856 extends Sequence1 {

  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (StringUtils.isPalindrome(mK.multiply(Functions.REVERSE.z(mK)).add(1).toString())) {
        return mK;
      }
    }
  }
}
