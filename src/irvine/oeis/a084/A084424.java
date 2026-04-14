package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084424 Odd numbers having odd numbers of prime factors, odd sums of prime factors and odd sums of decimal digits.
 * @author Sean A. Irvine
 */
public class A084424 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    if ((Functions.DIGIT_SUM.l(n) & 1) == 0) {
      return false;
    }
    if ((Functions.BIG_OMEGA.l(n) & 1) == 0) {
      return false;
    }
    return (Functions.SOPF.l(n) & 1) == 1;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
