package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A027719 Numbers k such that k^2 + 1 is a palindrome.
 * @author Sean A. Irvine
 */
public class A027719 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().add(1).toString())) {
        return mN;
      }
    }
  }
}
