package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A390549 allocated for Davide Oliveri.
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
