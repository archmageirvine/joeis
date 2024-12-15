package irvine.oeis.a073;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073619 a(1) = 0; a(n) = smallest composite number which is a sum of n distinct primes.
 * @author Sean A. Irvine
 */
public class A073619 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;
  private long mSum = 0;

  @Override
  public Z next() {
    // The answer will be close to the sum of the first n primes
    mP = mPrime.nextPrime(mP);
    mSum += mP;
    if (++mN == 1) {
      return Z.ZERO;
    }
    if (!mPrime.isPrime(mSum)) {
      return Z.valueOf(mSum);
    }
    final long q = mPrime.nextPrime(mP);
    final TreeSet<Long> possibles = new TreeSet<>();
    for (long r = 2; r <= mP; r = mPrime.nextPrime(r)) {
      final long s = mSum - r + q;
      if (!mPrime.isPrime(s)) {
        possibles.add(s);
      }
    }
    return Z.valueOf(possibles.first());
  }
}
