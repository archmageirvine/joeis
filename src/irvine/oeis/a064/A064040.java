package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064040 Integers whose number of distinct prime divisors is prime.
 * @author Sean A. Irvine
 */
public class A064040 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Functions.OMEGA.i(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
