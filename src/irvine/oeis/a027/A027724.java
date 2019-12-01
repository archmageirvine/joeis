package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A027724 Numbers k such that <code>k^2+k+8</code> is a palindrome.
 * @author Sean A. Irvine
 */
public class A027724 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().add(mN).add(8).toString())) {
        return mN;
      }
    }
  }
}
