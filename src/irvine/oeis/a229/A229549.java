package irvine.oeis.a229;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A229549 Numbers k such that k*(sum of digits of k) is a palindrome.
 * @author Georg Fischer
 */
public class A229549 extends Sequence1 {

  private Z mK = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (StringUtils.isPalindrome(mK.multiply(ZUtils.digitSum(mK)).toString())) {
        return mK;
      }
    }
  }
}
