package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074665 8-digit distinct digit primes.
 * @author Sean A. Irvine
 */
public class A074665 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 10234588;

  @Override
  public Z next() {
    while (mN < 100000000) {
      mN = mPrime.nextPrime(mN);
      if (mN < 100000000 && Integer.bitCount(Functions.SYNDROME.i(mN)) == 8) {
        return Z.valueOf(mN);
      }
    }
    return null;
  }
}
