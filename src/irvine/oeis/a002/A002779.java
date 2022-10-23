package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A002779 Palindromic squares.
 * @author Sean A. Irvine
 */
public class A002779 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z n2 = mN.square();
      if (StringUtils.isPalindrome(n2.toString())) {
        return n2;
      }
    }
  }
}
