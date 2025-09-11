package irvine.math.predicate;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * Test if a number is a primorial.
 * @author Sean A. Irvine
 */
class Primorial extends AbstractPredicate {

  private final Fast mPrime = new Fast();

  @Override
  public boolean is(Z n) {
    long p = 2;
    while (!n.isOne()) {
      if (n.mod(p) != 0) {
        return false;
      }
      n = n.divide(p);
      if (n.mod(p) == 0) {
        return false;
      }
      p = mPrime.nextPrime(p);
    }
    return true;
  }

  @Override
  public boolean is(long n) {
    long p = 2;
    while (n != 1) {
      if (n % p != 0) {
        return false;
      }
      n /= p;
      if (n % p == 0) {
        return false;
      }
      p = mPrime.nextPrime(p);
    }
    return true;
  }
}
