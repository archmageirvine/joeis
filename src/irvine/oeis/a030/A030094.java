package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A030094 Product of n with 666 is palindromic.
 * @author Sean A. Irvine
 */
public class A030094 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.multiply(666).toString())) {
        return mN;
      }
    }
  }
}
