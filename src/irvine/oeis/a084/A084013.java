package irvine.oeis.a084;

import irvine.math.z.LengthPalindromes;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084013 Smallest n-digit palindromic multiple of n. For n = 10k it is sufficient that the multiple is palindromic with leading zeros ignored. 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A084013 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    int m = ++mN;
    int zeros = 0;
    while (m % 10 == 0) {
      ++zeros;
      m /= 10;
    }
    final LengthPalindromes palindromes = new LengthPalindromes(mN - zeros);
    Z p;
    while ((p = palindromes.next()) != null) {
      if (p.mod(m) == 0) {
        return p.multiply(Z.TEN.pow(zeros));
      }
    }
    return Z.ZERO;
  }
}
