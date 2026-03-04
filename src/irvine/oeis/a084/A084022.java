package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084022 Largest n-digit palindromic multiple of n with a digit sum that is also a multiple of n, or 0 if no such number exists. For n a multiple of 10 it is sufficient that a(n) be palindromic when trailing zeros are ignored.
 * @author Sean A. Irvine
 */
public class A084022 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    int m = ++mN;
    int zeros = 0;
    while (m % 10 == 0) {
      ++zeros;
      m /= 10;
    }
    // this could be made better to handle even and multiples of 5
    Z p = Z.TEN.pow(mN - zeros);
    while (true) {
      p = Functions.PREV_PALINDROME.z(p.subtract(1));
      if (p.mod(m) == 0 && Functions.DIGIT_SUM.l(p) % mN == 0) {
        return p.multiply(Z.TEN.pow(zeros));
      }
    }
  }
}
