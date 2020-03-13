package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029958 Numbers that are palindromic in base 13.
 * @author Sean A. Irvine
 */
public class A029958 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (StringUtils.isPalindrome(Long.toString(++mN, 13))) {
        return Z.valueOf(mN);
      }
    }
  }
}
