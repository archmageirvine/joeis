package irvine.oeis.a016;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016027 Indices of prime Mersenne numbers (A001348).
 * @author Sean A. Irvine
 */
public class A016027 extends Sequence1 {

  private final Fast mPrime = new Fast(); // this knows about Mersenne primes
  private long mP = 1;
  private long mPi = 0;

  @Override
  public Z next() {
    while (true) {
      ++mPi;
      mP = mPrime.nextPrime(mP);
      if (Z.ONE.shiftLeft(mP).subtract(1).isPrime()) {
        return Z.valueOf(mPi);
      }
    }
  }
}
