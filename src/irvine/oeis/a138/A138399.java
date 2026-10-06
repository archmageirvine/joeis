package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086786.
 * @author Sean A. Irvine
 */
public class A138399 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(2).isProbablePrime()) {
        final Z q = mPrime.nextPrime(p.add(2));
        if (q.add(2).isProbablePrime()) {
          final Z r = mPrime.nextPrime(q.add(2)); // middle prime
          final Z s = mPrime.nextPrime(r);
          if (s.add(2).isProbablePrime()) {
            final Z t = mPrime.nextPrime(s.add(2));
            if (t.add(2).isProbablePrime()) {
              // We now have p, p+2, q, q+2, r, s, s+2, t, t+2 are all prime
              final Z sum = p.multiply2().add(q.multiply2()).add(s.multiply2()).add(t.multiply2()).add(r).add(8);
              if (sum.isProbablePrime()) {
                return r;
              }
            }
          }
        }
      }
    }
  }
}
