package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A006030 Palindromic tetrahedral numbers.
 * @author Sean A. Irvine
 */
public class A006030 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.multiply(mN.add(1)).multiply(mN.add(2)).divide(6);
      if (StringUtils.isPalindrome(t.toString())) {
        return t;
      }
    }
  }
}

