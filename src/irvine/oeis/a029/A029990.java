package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A029990 Numbers k such that k^2 is palindromic in base 6.
 * @author Sean A. Irvine
 */
public class A029990 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().toString(6))) {
        return mN;
      }
    }
  }
}
