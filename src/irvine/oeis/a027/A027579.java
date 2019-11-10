package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A027579 Numbers n such that <code>n^2 + (n+1)^2 + (n+2)^2 + (n+3)^2 + (n+4)^2</code> is palindromic.
 * @author Sean A. Irvine
 */
public class A027579 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.square().add(mN.add(1).square()).add(mN.add(2).square()).add(mN.add(3).square()).add(mN.add(4).square()).toString())) {
        return mN;
      }
    }
  }
}
