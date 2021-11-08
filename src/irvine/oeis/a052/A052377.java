package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a031.A031926;

/**
 * A052377 Primes followed by an [8,4,8]=[d,D-d,d] prime difference pattern of A001223.
 * @author Sean A. Irvine
 */
public class A052377 extends A031926 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      //final Z q = p.add(8); // known to be prime by A031926
      final Z r = p.add(12);
      if (r.isProbablePrime() && mPrime.nextPrime(r).subtract(r).equals(Z.EIGHT)) {
        return p;
      }
    }
  }
}
