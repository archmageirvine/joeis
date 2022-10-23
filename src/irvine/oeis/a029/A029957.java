package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A029957 Numbers that are palindromic in base 12.
 * @author Sean A. Irvine
 */
public class A029957 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (StringUtils.isPalindrome(Long.toString(++mN, 12))) {
        return Z.valueOf(mN);
      }
    }
  }
}
