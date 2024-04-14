package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A062293 Smallest multiple k*n of n which has even digits and is a palindrome or becomes a palindrome when 0's are added on the left (e.g., 10 becomes 010, which is a palindrome).
 * @author Sean A. Irvine
 */
public class A062293 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.ZERO; // Avoid extra checking later
    }
    long k = 0;
    while (true) {
      Z t = mN.multiply(++k);
      final Z r = t;
      while (t.mod(10) == 0) {
        t = t.divide(10);
      }
      if ((Functions.SYNDROME.i(t) & 0b1010101010) == 0 && ZUtils.isPalindrome(t, 10)) {
        return r;
      }
    }
  }
}

