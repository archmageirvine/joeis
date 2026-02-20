package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082521 Least palindromic prime with at least 2n+1 central 0's.
 * @author Sean A. Irvine
 */
public class A082521 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final String z = "0".repeat(mN);
    long k = 0;
    while (true) {
      final String s = String.valueOf(++k);
      final char c = s.charAt(0);
      if (c == '1' || c == '3' || c == '7' || c == '9') {
        final Z palindrome = new Z(k + z + new StringBuilder(s).reverse());
        if (palindrome.isProbablePrime()) {
          return palindrome;
        }
      }
    }
  }
}
