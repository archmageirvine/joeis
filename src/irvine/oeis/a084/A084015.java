package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084015 Largest n-digit palindromic multiple of n. For n = 10k it is sufficient that the multiple is palindromic with leading zeros ignored. 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A084015 extends Sequence1 {

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
      if (p.mod(m) == 0) {
        return p.multiply(Z.TEN.pow(zeros));
      }
    }
  }
}
