package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.LengthPalindromes;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083440 Smallest n-digit palindrome with a digit sum of n.
 * @author Sean A. Irvine
 */
public class A083440 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final LengthPalindromes palin = new LengthPalindromes(++mN);
    while (true) {
      final Z p = palin.next();
      if (p == null) {
        return Z.ZERO;
      }
      if (Functions.DIGIT_SUM.i(p) == mN) {
        return p;
      }
    }
  }
}
