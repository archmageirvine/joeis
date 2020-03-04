package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029735 Numbers n such that <code>n^3</code> is palindromic in base 16.
 * @author Sean A. Irvine
 */
public class A029735 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.pow(3).toString(16))) {
        return mN;
      }
    }
  }
}
