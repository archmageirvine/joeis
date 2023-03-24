package irvine.oeis.a141;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062204.
 * @author Sean A. Irvine
 */
public class A141586 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (n % Jaguar.factor(d).sigma0AsLong() != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mN == 1) {
      mN = 0;
      return Z.ONE; // only odd term
    }
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

