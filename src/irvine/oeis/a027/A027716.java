package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A027716 Numbers k such that k^2 + k + 4 is a palindrome.
 * @author Sean A. Irvine
 */
public class A027716 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().add(mN).add(4).toString())) {
        return mN;
      }
    }
  }
}
