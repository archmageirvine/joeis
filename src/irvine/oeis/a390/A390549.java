package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A390549 Smallest b&gt;=2 for which Q_{n}(b) = prime(n) + Sum{k=1..n-1} b^(prime(n) - prime(k)) is prime, or -1 if no such b exists.
 * @author Sean A. Irvine
 */
public class A390549 extends A000040 {

  @Override
  public Z next() {
    final Z pp = super.next();
    final long p = pp.longValueExact();
    Z b = Z.ONE;
    while (true) {
      b = b.add(1);
      Z s = pp;
      for (long q = 2; q < p; q = mPrime.nextPrime(q)) {
        s = s.add(b.pow(p - q));
      }
      if (s.isProbablePrime()) {
        return b;
      }
    }
  }
}
