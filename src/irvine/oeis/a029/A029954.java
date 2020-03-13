package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029954 Palindromic in base 7.
 * @author Sean A. Irvine
 */
public class A029954 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (StringUtils.isPalindrome(Long.toString(++mN, 7))) {
        return Z.valueOf(mN);
      }
    }
  }
}
