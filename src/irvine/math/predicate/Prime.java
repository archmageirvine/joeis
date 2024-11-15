package irvine.math.predicate;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * Test if a number is a (probable) prime.
 * @author Sean A. Irvine
 */
class Prime extends AbstractPredicate {

  private final Fast mPrime = new Fast();

  @Override
  public boolean is(final Z n) {
    return n.isProbablePrime();
  }

  @Override
  public boolean is(final long n) {
    return mPrime.isPrime(n);
  }

  @Override
  public boolean is(final int n) {
    return mPrime.isPrime(n);
  }
}
