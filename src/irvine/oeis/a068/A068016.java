package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A068016 Lonely non-twin primes: non-twins sandwiched between two pairs of twins.
 * @author Sean A. Irvine
 */
public class A068016 extends A001359 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z lower = mP;
      final Z a = mPrime.nextPrime(mPrime.nextPrime(lower));
      mP = super.next();
      if (mPrime.nextPrime(a).equals(mP)) {
        return a;
      }
    }
  }
}
