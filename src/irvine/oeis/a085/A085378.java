package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A085378 Difference between primes p and the largest prime divisor of p-1.
 * @author Sean A. Irvine
 */
public class A085378 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mP = 3;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(mP - Functions.GPF.l(mP - 1));
  }
}
