package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070027 Prime numbers whose initial, all intermediate and final iterated sums of digits are primes.
 * @author Sean A. Irvine
 */
public class A070027 extends A000040 {

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
      final Z p = super.next();
      if (is(p.longValueExact())) {
        return p;
      }
    }
  }
}
