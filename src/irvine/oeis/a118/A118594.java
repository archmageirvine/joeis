package irvine.oeis.a118;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A118594 Palindromes in base 3 (written in base <code>3)</code>.
 * @author Sean A. Irvine
 */
public class A118594 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String base3 = Long.toString(++mN, 3);
      if (StringUtils.isPalindrome(base3)) {
        return new Z(base3);
      }
    }
  }
}

