package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a031.A031924;

/**
 * A052160 Isolated prime difference equals 6: primes prime(k) such that d(k) = prime(k+1) - prime(k) = 6 but neither d(k+1) nor d(k-1) is 6.
 * @author Sean A. Irvine
 */
public class A052160 extends A031924 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!p.subtract(mPrime.prevPrime(p)).equals(Z.SIX)) {
        final Z next = p.add(6); // already known to be prime by A031924
        if (!mPrime.nextPrime(next).subtract(next).equals(Z.SIX)) {
          return p;
        }
      }
    }
  }
}
