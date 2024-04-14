package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066640 Numbers such that all divisors have only odd digits.
 * @author Sean A. Irvine
 */
public class A066640 extends Sequence1 {

  private long mN = -1;

  private boolean is(final long n) {
    for (final Z d : Jaguar.factor(n).divisors()) {
      if ((Functions.SYNDROME.i(d) & 0b101010101) != 0) {
        return false;
      }
    }
    return true;
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
