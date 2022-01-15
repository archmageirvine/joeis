package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A053706 Primes p such that between p and the next prime, 2 prime powers (A025475) occur.
 * @author Sean A. Irvine
 */
public class A053706 extends A025475 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z a = mA;
      mA = super.next();
      final Z p = mPrime.prevPrime(a);
      final Z q = mPrime.nextPrime(p);
      if (q.compareTo(mA) > 0) {
        return p;
      }
    }
  }
}
