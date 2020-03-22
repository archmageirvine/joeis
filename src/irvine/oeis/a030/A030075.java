package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A030075 Squares which are palindromes in base 15.
 * @author Sean A. Irvine
 */
public class A030075 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (StringUtils.isPalindrome(s.toString(15))) {
        return s;
      }
    }
  }
}
