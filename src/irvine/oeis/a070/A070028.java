package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003459;

/**
 * A070028 Absolute primes: primes whose initial, all intermediate and final sums of digits are primes.
 * @author Sean A. Irvine
 */
public class A070028 extends A003459 {

  private boolean is(final Z v) {
    if (!mPrime.isPrime(v)) {
      return false;
    }
    if (v.compareTo(Z.TEN) < 0) {
      return true;
    }
    return is(Functions.DIGIT_SUM.z(v));
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
