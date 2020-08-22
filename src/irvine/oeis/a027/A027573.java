package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A027573 Numbers n such that n^2 + (n+1)^2 + (n+2)^2 is palindromic.
 * @author Sean A. Irvine
 */
public class A027573 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().add(mN.add(1).square()).add(mN.add(2).square()).toString())) {
        return mN;
      }
    }
  }
}
