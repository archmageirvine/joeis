package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A029959 Numbers that are palindromic in base 14.
 * @author Sean A. Irvine
 */
public class A029959 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (StringUtils.isPalindrome(Long.toString(++mN, 14))) {
        return Z.valueOf(mN);
      }
    }
  }
}
