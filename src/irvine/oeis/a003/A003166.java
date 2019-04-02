package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A003166 Numbers whose square in base 2 is a palindrome.
 * @author Sean A. Irvine
 */
public class A003166 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().toString(2))) {
        return mN;
      }
    }
  }
}
