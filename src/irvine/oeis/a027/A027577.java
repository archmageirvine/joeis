package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A027577 Palindromes of form n^2 + (n+1)^2 + (n+2)^2 + (n+3)^2.
 * @author Sean A. Irvine
 */
public class A027577 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(mN.add(1).square()).add(mN.add(2).square()).add(mN.add(3).square());
      if (StringUtils.isPalindrome(m.toString())) {
        return m;
      }
    }
  }
}
