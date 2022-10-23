package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007795 Juxtapose pairs of primes.
 * @author Sean A. Irvine
 */
public class A007795 extends Sequence1 {

  private long mP = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final String a = String.valueOf(mP);
    mP = mPrime.nextPrime(mP);
    return new Z(a + mP);
  }
}
