package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a023.A023200;

/**
 * A052378 Primes followed by a [4,2,4] prime difference pattern of A001223.
 * @author Sean A. Irvine
 */
public class A052378 extends A023200 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      //final Z q = p.add(4); // known to be prime by A023200
      final Z r = p.add(6);
      if (r.isProbablePrime() && mPrime.nextPrime(r).subtract(r).equals(Z.FOUR)) {
        return p;
      }
    }
  }
}
