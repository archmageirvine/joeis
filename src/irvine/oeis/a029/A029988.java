package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029988 Numbers k such that k^2 is palindromic in base 5.
 * @author Sean A. Irvine
 */
public class A029988 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().toString(5))) {
        return mN;
      }
    }
  }
}
