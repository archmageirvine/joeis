package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A138397 Primes k such that k = p+q+r+s+t where p, q, r, s, t are consecutive primes and (p,q) and (s,t) are twin prime pairs (i.e., q=p+2 and t=s+2).
 * @author Sean A. Irvine
 */
public class A138397 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (q.subtract(p).equals(Z.TWO)) {
        final Z r = mPrime.nextPrime(q);
        final Z s = mPrime.nextPrime(r);
        final Z t = mPrime.nextPrime(s);
        if (t.subtract(s).equals(Z.TWO)) {
          final Z sum = p.add(q).add(r).add(s).add(t);
          if (sum.isProbablePrime()) {
            return sum;
          }
        }
      }
    }
  }
}
