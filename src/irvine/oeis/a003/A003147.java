package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001175;

/**
 * A003147 Primes p with a Fibonacci primitive root g, i.e., such that g^2 = g <code>+ 1 (mod</code> p).
 * @author Sean A. Irvine
 */
public class A003147 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 0;

  @Override
  public Z next() {
    if (mP == 0) {
      mP = 5;
    } else {
      do {
        mP = mPrime.nextPrime(mP);
      } while (A001175.pisanoPeriod(mP) != mP - 1);
    }
    return Z.valueOf(mP);
  }
}
