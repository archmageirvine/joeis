package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029805 Numbers n such that <code>n^2</code> is palindromic in base 8.
 * @author Sean A. Irvine
 */
public class A029805 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().toString(8))) {
        return mN;
      }
    }
  }
}
