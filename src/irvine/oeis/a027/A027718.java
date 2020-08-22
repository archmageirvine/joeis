package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A027718 Numbers k such that k^2+k+5 is a palindrome.
 * @author Sean A. Irvine
 */
public class A027718 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().add(mN).add(5).toString())) {
        return mN;
      }
    }
  }
}
