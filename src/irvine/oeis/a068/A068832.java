package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A068832 Primes with all odd digits such that the next four primes also contain all odd digits.
 * @author Sean A. Irvine
 */
public class A068832 extends A000040 {

  private static final long EVENS = 0b101010101;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if ((ZUtils.syn(p) & EVENS) == 0) {
        final Z q = mPrime.nextPrime(p);
        if ((ZUtils.syn(q) & EVENS) == 0) {
          final Z r = mPrime.nextPrime(q);
          if ((ZUtils.syn(r) & EVENS) == 0) {
            final Z s = mPrime.nextPrime(r);
            if ((ZUtils.syn(s) & EVENS) == 0 && (ZUtils.syn(mPrime.nextPrime(s)) & EVENS) == 0) {
              return p;
            }
          }
        }
      }
    }
  }
}
