package irvine.oeis.a061;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061784 Number of sums prime(i) + prime(j) that occur more than once for 1 &lt;= i &lt;= j &lt;= n, where prime(k) = k-th prime.
 * @author Sean A. Irvine
 */
public class A061784 extends Sequence1 {

  private final HashSet<Long> mSums = new HashSet<>();
  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mCnt = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mSums.add(2 * mP);
    for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
      final long s = mP + q;
      if (!mSums.add(s)) {
        ++mCnt;
      }
    }
    return Z.valueOf(mCnt);
  }
}

