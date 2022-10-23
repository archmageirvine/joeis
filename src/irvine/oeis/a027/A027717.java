package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A027717 Palindromes of form k^2 + k + 4.
 * @author Sean A. Irvine
 */
public class A027717 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(mN).add(4);
      if (StringUtils.isPalindrome(m.toString())) {
        return m;
      }
    }
  }
}
