package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029999 Squares which are palindromes in base 13.
 * @author Sean A. Irvine
 */
public class A029999 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.square();
      if (StringUtils.isPalindrome(t.toString(13))) {
        return t;
      }
    }
  }
}
