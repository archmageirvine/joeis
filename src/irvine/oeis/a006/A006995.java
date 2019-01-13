package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A006995.
 * @author Sean A. Irvine
 */
public class A006995 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (StringUtils.isPalindrome(Long.toBinaryString(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
