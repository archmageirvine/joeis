package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029993 Squares which are palindromes in base 7.
 * @author Sean A. Irvine
 */
public class A029993 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.square();
      if (StringUtils.isPalindrome(t.toString(7))) {
        return t;
      }
    }
  }
}
