package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007796 List of pairs of primes in reverse order, starting at 1.
 * @author Sean A. Irvine
 */
public class A007796 extends Sequence1 {

  private long mP = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mP = mP == 0 ? 1 : mPrime.nextPrime(mP);
    final String a = String.valueOf(mP);
    mP = mPrime.nextPrime(mP);
    return new Z(mP + a);
  }
}
