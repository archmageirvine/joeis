package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a031.A031928;

/**
 * A052376 Primes followed by a [10,2,10] prime difference pattern of A001223.
 * @author Sean A. Irvine
 */
public class A052376 extends A031928 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      //final Z q = p.add(10); // known to be prime by A031928
      final Z r = p.add(12);
      if (r.isProbablePrime() && mPrime.nextPrime(r).subtract(r).equals(Z.TEN)) {
        return p;
      }
    }
  }
}
