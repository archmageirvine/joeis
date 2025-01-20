package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074303 Sum of squares of digits of n is equal to the largest prime factor of n reversed, where the largest prime factor is not a palindrome.
 * @author Sean A. Irvine
 */
public class A074303 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long gpf = Functions.GPF.l(++mN);
      final long rev = Functions.REVERSE.l(gpf);
      if (rev != gpf && rev == Functions.DIGIT_SUM_SQUARES.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
