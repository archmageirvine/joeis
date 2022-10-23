package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A020485 Least positive palindromic multiple of n, or 0 if none exists.
 * @author Sean A. Irvine
 */
public class A020485 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.mod(10) == 0) {
      return Z.ZERO;
    }
    long m = 0;
    while (true) {
      final Z c = mN.multiply(++m);
      if (StringUtils.isPalindrome(c.toString())) {
        return c;
      }
    }
  }
}
