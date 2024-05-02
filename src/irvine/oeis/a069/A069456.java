package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069456 Non-twin primes that are at least doubly lonely.
 * @author Sean A. Irvine
 */
public class A069456 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (q.subtract(p).equals(Z.TWO)) {
        final Z r = mPrime.nextPrime(q);
        final Z s = mPrime.nextPrime(r);
        if (s.subtract(r).equals(Z.TWO)) {
          final Z t = mPrime.nextPrime(s);
          final Z u = mPrime.nextPrime(t);
          final Z v = mPrime.nextPrime(u);
          if (v.subtract(u).equals(Z.TWO)) {
            final Z w = mPrime.nextPrime(v);
            final Z x = mPrime.nextPrime(w);
            if (x.subtract(w).equals(Z.TWO)) {
              return t;
            }
          }
        }
      }
    }
  }
}

