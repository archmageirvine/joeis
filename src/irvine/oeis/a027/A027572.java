package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A027572 Palindromes of form <code>n^2 + (n+1)^2</code>.
 * @author Sean A. Irvine
 */
public class A027572 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(mN.add(1).square());
      if (StringUtils.isPalindrome(m.toString())) {
        return m;
      }
    }
  }
}
