package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062115 Numbers with no prime substring in their decimal expansion.
 * @author Sean A. Irvine
 */
public class A062115 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  private boolean is(final long n) {
    final String s = Long.toString(n);
    for (long k = 11; k <= n; k = mPrime.nextPrime(k)) {
      if (s.contains(Long.toString(k))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if ((Functions.SYNDROME.i(++mN) & 0b0010101100) == 0 && is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
