package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086758 a(n) is the smallest m such that the integer part of the first n powers of m^(1/n) are primes.
 * @author Sean A. Irvine
 */
public class A086758 extends Sequence1 {

  private final Fast mPrimes = new Fast();
  private int mN = 0;

  private boolean is(final Z m) {
    for (int k = mN - 1; k > 0; --k) {
      if (!m.pow(k).root(mN).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    Z m = mPrimes.nextPrime(Z.ONE.shiftLeft(mN).subtract(1));
    //System.out.println("min=" + m);
    while (!is(m)) {
      m = mPrimes.nextPrime(m);
    }
    return m;
  }
}
