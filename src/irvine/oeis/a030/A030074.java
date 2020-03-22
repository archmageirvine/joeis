package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A030074 Squares which are palindromes in base 14.
 * @author Sean A. Irvine
 */
public class A030074 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (StringUtils.isPalindrome(s.toString(14))) {
        return s;
      }
    }
  }
}
