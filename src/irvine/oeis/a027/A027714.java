package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A027714 Numbers k such that k^2+k+3 is a palindrome.
 * @author Sean A. Irvine
 */
public class A027714 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().add(mN).add(3).toString())) {
        return mN;
      }
    }
  }
}
