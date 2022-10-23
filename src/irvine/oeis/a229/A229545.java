package irvine.oeis.a229;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A229545 Numbers n such that n + (sum of digits of n) is a palindrome.
 * @author Georg Fischer
 */
public class A229545 extends Sequence1 {

  private Z mK = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (StringUtils.isPalindrome(mK.add(ZUtils.digitSum(mK)).toString())) {
        return mK;
      }
    }
  }
}
