package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075365 Smallest k such that (n+1)(n+2)...(n+k) is divisible by the product of all the primes up to n.
 * @author Sean A. Irvine
 */
public class A075365 extends Sequence1 {

  private final Fast mPrime = new Fast();
  protected int mN = 0;

  @Override
  public Z next() {
    return ++mN == 10 ? Z.FIVE : mN == 1 ? Z.ZERO : Z.valueOf(2 * mPrime.prevPrime(mN + 1) - mN);
  }
}
