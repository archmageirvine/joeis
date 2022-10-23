package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A029985 Squares which are palindromes in base 3.
 * @author Sean A. Irvine
 */
public class A029985 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.square();
      if (StringUtils.isPalindrome(t.toString(3))) {
        return t;
      }
    }
  }
}
