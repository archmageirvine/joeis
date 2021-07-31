package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029733 Numbers k such that k^2 is palindromic in base 16.
 * @author Sean A. Irvine
 */
public class A029733 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().toString(16))) {
        return mN;
      }
    }
  }
}
