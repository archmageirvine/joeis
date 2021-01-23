package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A006029 Numbers n such that n-th tetrahedral number n*(n+1)*(n+2)/6 is palindromic.
 * @author Sean A. Irvine
 */
public class A006029 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.multiply(mN.add(1)).multiply(mN.add(2)).divide(6);
      if (StringUtils.isPalindrome(t.toString())) {
        return mN;
      }
    }
  }
}

