package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A014190 Palindromes in base 3 (written in base 10).
 * @author Sean A. Irvine
 */
public class A014190 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (StringUtils.isPalindrome(Long.toString(++mN, 3))) {
        return Z.valueOf(mN);
      }
    }
  }
}
