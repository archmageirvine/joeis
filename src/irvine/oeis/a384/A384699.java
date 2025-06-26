package irvine.oeis.a384;

import java.util.LinkedList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384699 Triples of distinct primes whose sum is a perfect square ordered by increasing sum and then lexicographically.
 * @author Sean A. Irvine
 */
public class A384699 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LinkedList<Long> mA = new LinkedList<>();
  private long mN = 0;
  private long mS = 0;
  private long mP = 0;
  private long mQ = 0;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mQ = mPrime.nextPrime(mQ);
      if (mP + 2 * mQ >= mS) {
        mP = mPrime.nextPrime(mP);
        mQ = mPrime.nextPrime(mP);
        if (mP + 2 * mQ > mS) {
          mS = ++mN * mN;
          mP = 2;
          mQ = 3;
        }
      }
      final long r = mS - mQ - mP;
      if (r > mQ && mPrime.isPrime(r)) {
        mA.add(mP);
        mA.add(mQ);
        mA.add(r);
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
