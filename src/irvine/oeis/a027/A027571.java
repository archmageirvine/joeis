package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A027571 Numbers k such that k^2 + (k+1)^2 is palindromic.
 * @author Sean A. Irvine
 */
public class A027571 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().add(mN.add(1).square()).toString())) {
        return mN;
      }
    }
  }
}
