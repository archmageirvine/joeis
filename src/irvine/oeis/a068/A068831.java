package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068831 Primes with all odd digits such that the next three primes also contain all odd digits.
 * @author Sean A. Irvine
 */
public class A068831 extends A000040 {

  private static final long EVENS = 0b101010101;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if ((Functions.SYNDROME.i(p) & EVENS) == 0) {
        final Z q = mPrime.nextPrime(p);
        if ((Functions.SYNDROME.i(q) & EVENS) == 0) {
          final Z r = mPrime.nextPrime(q);
          if ((Functions.SYNDROME.i(r) & EVENS) == 0 && (Functions.SYNDROME.i(mPrime.nextPrime(r)) & EVENS) == 0) {
            return p;
          }
        }
      }
    }
  }
}
