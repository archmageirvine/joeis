package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A027574 Palindromes of form n^2 + (n+1)^2 + (n+2)^2.
 * @author Sean A. Irvine
 */
public class A027574 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(mN.add(1).square()).add(mN.add(2).square());
      if (StringUtils.isPalindrome(m.toString())) {
        return m;
      }
    }
  }
}
