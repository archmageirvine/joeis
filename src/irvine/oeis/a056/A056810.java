package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A056810 Numbers whose fourth power is a palindrome.
 * @author Georg Fischer
 */
public class A056810 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.pow(4).toString())) {
        return mN;
      }
    }
  }
}
