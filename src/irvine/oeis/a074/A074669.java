package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074669 Six-digit distinct-digit primes.
 * @author Sean A. Irvine
 */
public class A074669 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 102358;

  @Override
  public Z next() {
    while (mN < 1000000) {
      mN = mPrime.nextPrime(mN);
      if (mN < 1000000 && Integer.bitCount(Functions.SYNDROME.i(mN)) == 6) {
        return Z.valueOf(mN);
      }
    }
    return null;
  }
}
