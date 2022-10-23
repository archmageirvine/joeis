package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A029950 Odd palindromes.
 * @author Sean A. Irvine
 */
public class A029950 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (StringUtils.isPalindrome(mN.toString())) {
        return mN;
      }
    }
  }
}
