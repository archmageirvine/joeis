package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A030072 Numbers n such that n^2 is palindromic in base 14.
 * @author Sean A. Irvine
 */
public class A030072 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().toString(14))) {
        return mN;
      }
    }
  }
}
