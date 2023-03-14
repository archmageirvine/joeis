package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A061906 Obtain m by omitting trailing zeros from n; a(n) = smallest k such that k*m is a palindrome.
 * @author Sean A. Irvine
 */
public class A061906 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ONE; // Avoid extra checking later
    }
    long k = 0;
    Z m = mN;
    while (m.mod(10) == 0) {
      m = m.divide(10);
    }
    while (true) {
      if (ZUtils.isPalindrome(m.multiply(++k), 10)) {
        return Z.valueOf(k);
      }
    }
  }
}

