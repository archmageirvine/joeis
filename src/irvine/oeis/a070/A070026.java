package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070026 Initial, all intermediate and final iterated sums of digits of n are primes.
 * @author Sean A. Irvine
 */
public class A070026 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  private boolean is(final long v) {
    if (!mPrime.isPrime(v)) {
      return false;
    }
    if (v < 10) {
      return true;
    }
    return is(Functions.DIGIT_SUM.l(v));
  }

  @Override
  public Z next() {
    while (true) {
      if (is(Functions.DIGIT_SUM.l(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
