package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A061915 Obtain m by omitting trailing zeros from n; a(n) = smallest multiple k*m which is a palindrome with even digits, or -1 if no such multiple exists.
 * @author Sean A. Irvine
 */
public class A061915 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ZERO; // Avoid extra checking later
    }
    long k = 0;
    Z m = mN;
    while (m.mod(10) == 0) {
      m = m.divide(10);
    }
    if (m.mod(10) == 5) {
      return Z.NEG_ONE;
    }
    while (true) {
      final Z t = m.multiply(++k);
      if (ZUtils.isPalindrome(t, 10) && (ZUtils.syn(t) & 0b1010101010) == 0) {
        return t;
      }
    }
  }
}

