package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033955 a(n) = sum of the remainders when the n-th prime is divided by primes up to the (n-1)-th prime.
 * @author Sean A. Irvine
 */
public class A033955 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  protected long mP = 1;

  @Override
  public Z next() {
    ++mN;
    mP = mPrime.nextPrime(mP);
    Z sum = Z.ZERO;
    for (long k = 1, q = 2; k < mN; ++k, q = mPrime.nextPrime(q)) {
      sum = sum.add(mP % q);
    }
    return sum;
  }
}
