package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003631 Primes congruent to 2 or 3 modulo 5.
 * @author Sean A. Irvine
 */
public class A003631 implements Sequence {

  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(5);
      if (r == 2 || r == 3) {
        return mP;
      }
    }
  }
}
