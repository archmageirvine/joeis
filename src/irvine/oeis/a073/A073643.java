package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073643 Nine-digit primes with all distinct digits.
 * @author Sean A. Irvine
 */
public class A073643 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 102345688;

  @Override
  public Z next() {
    if (mP >= 1000000000) {
      return null;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP >= 1000000000) {
        return null;
      }
      if (Integer.bitCount(Functions.SYNDROME.i(mP)) == 9) {
        return Z.valueOf(mP);
      }
    }
  }
}
