package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A014192 Palindromes in base <code>4</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A014192 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (StringUtils.isPalindrome(Long.toString(++mN, 4))) {
        return Z.valueOf(mN);
      }
    }
  }
}
