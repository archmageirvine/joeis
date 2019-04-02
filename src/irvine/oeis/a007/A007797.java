package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007797 List of pairs of primes in reverse order.
 * @author Sean A. Irvine
 */
public class A007797 implements Sequence {

  private long mP = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final String a = String.valueOf(mP);
    mP = mPrime.nextPrime(mP);
    return new Z(mP + a);
  }
}
