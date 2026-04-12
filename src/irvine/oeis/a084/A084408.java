package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084408 Triangle read by rows: if n is prime, row n contains the n smallest primes not already used; if n is composite, row n contains the n smallest composite numbers not already used. A permutation of the positive integers.
 * @author Sean A. Irvine
 */
public class A084408 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;
  private long mP = 1;
  private long mC = 3;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mM = 0;
    }
    if (mPrime.isPrime(mN)) {
      mP = mPrime.nextPrime(mP);
      return Z.valueOf(mP);
    } else {
      if (mPrime.isPrime(++mC)) {
        ++mC;
      }
      return Z.valueOf(mC);
    }
  }
}
