package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A027580 Palindromes of the form <code>n^2 + (n+1)^2 + (n+2)^2 + (n+3)^2 + (n+4)^2</code>.
 * @author Sean A. Irvine
 */
public class A027580 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.square().add(mN.add(1).square()).add(mN.add(2).square()).add(mN.add(3).square()).add(mN.add(4).square());
      if (StringUtils.isPalindrome(m.toString())) {
        return m;
      }
    }
  }
}
