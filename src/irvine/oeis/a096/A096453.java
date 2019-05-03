package irvine.oeis.a096;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A096453 Primes p such that the number of primes q, <code>5 &lt;= q &lt</code>; p, congruent to <code>1 mod 3</code>, is two less than the number of such primes congruent to <code>2 mod 3</code>.
 * @author Sean A. Irvine
 */
public class A096453 implements Sequence {

  private long mP = 3;
  private long mOne = 0;
  private long mThree = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final long q = mP % 3;
      if (q == 1) {
        ++mOne;
      } else if (q == 2) {
        ++mThree;
      }
      mP = mPrime.nextPrime(mP);
      if (mOne + 2 == mThree) {
        return Z.valueOf(mP);
      }
    }
  }
}

