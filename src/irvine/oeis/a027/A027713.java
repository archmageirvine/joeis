package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A027713 Palindromes of form k^2 + k + 2.
 * @author Sean A. Irvine
 */
public class A027713 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(mN).add(2);
      if (StringUtils.isPalindrome(m.toString())) {
        return m;
      }
    }
  }
}
