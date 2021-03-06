package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A028888 Smaller of two successive primes with a palindromic product.
 * @author Sean A. Irvine
 */
public class A028888 extends A000040 {

  protected Z mPrev = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      final Z p = mPrev;
      mPrev = super.next();
      if (StringUtils.isPalindrome(p.multiply(mPrev).toString())) {
        return p;
      }
    }
  }
}
