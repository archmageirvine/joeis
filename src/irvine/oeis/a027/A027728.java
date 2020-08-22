package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A027728 Palindromes of form k^2 + k + 5.
 * @author Sean A. Irvine
 */
public class A027728 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(mN).add(5);
      if (StringUtils.isPalindrome(m.toString())) {
        return m;
      }
    }
  }
}
