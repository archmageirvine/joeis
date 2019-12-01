package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A027720 Palindromes of form <code>k^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A027720 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(1);
      if (StringUtils.isPalindrome(m.toString())) {
        return m;
      }
    }
  }
}
