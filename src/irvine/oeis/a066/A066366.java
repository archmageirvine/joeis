package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a065.A065867;

/**
 * A066366 Primes which are the sum of a prime number of consecutive primes in a prime number of different ways.
 * @author Sean A. Irvine
 */
public class A066366 extends A065867 {

  private Z mT = null;

  @Override
  protected boolean accept(final State s) {
    return mPrime.isPrime(s.getValue()) && mPrime.isPrime(s.getNumTerms());
  }

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z t = mT;
      do {
        mT = super.next();
        ++cnt;
      } while (mT.equals(t));
      if (mPrime.isPrime(cnt)) {
        return t;
      }
    }
  }
}

