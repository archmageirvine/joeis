package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A002778 Numbers whose square is a palindrome.
 * @author Sean A. Irvine
 */
public class A002778 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().toString())) {
        return mN;
      }
    }
  }
}
