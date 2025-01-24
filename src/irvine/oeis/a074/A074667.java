package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074667 Seven-digit distinct-digit primes.
 * @author Sean A. Irvine
 */
public class A074667 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1023466;

  @Override
  public Z next() {
    while (mN < 10000000) {
      mN = mPrime.nextPrime(mN);
      if (mN < 10000000 && Integer.bitCount(Functions.SYNDROME.i(mN)) == 7) {
        return Z.valueOf(mN);
      }
    }
    return null;
  }
}
