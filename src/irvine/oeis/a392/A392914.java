package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392914 Primes starting a run of at least 4 consecutive primes with binary Hamming distance 1.
 * @author Sean A. Irvine
 */
public class A392914 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (p.xor(q).bitCount() == 1) {
        final Z r = mPrime.nextPrime(q);
        if (q.xor(r).bitCount() == 1) {
          final Z s = mPrime.nextPrime(r);
          if (r.xor(s).bitCount() == 1) {
            return p;
          }
        }
      }
    }
  }
}

