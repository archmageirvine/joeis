package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.LengthPalindromes;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A083438 Smallest 2n-1 digit palindromic prime with digit sum of 2n-1, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083438 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    final int m = 2 * ++mN - 1;
    if (m % 3 == 0) {
      return Z.ZERO;
    }
    final LengthPalindromes palin = new LengthPalindromes(m);
    while (true) {
      final Z p = palin.next();
      if (p == null) {
        return Z.ZERO;
      }
      if (Functions.DIGIT_SUM.i(p) == m && p.isProbablePrime()) {
        return p;
      }
    }
  }
}
