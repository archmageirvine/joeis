package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029984 Numbers n such that n^2 is palindromic in base 3.
 * @author Sean A. Irvine
 */
public class A029984 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().toString(3))) {
        return mN;
      }
    }
  }
}
