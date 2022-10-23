package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A029953 Palindromic in base 6.
 * @author Sean A. Irvine
 */
public class A029953 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (StringUtils.isPalindrome(Long.toString(++mN, 6))) {
        return Z.valueOf(mN);
      }
    }
  }
}
