package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.partitions.DistinctPartsPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054656 Number of primes &lt;= n which do not appear in any partitions of n into distinct primes.
 * @author Sean A. Irvine
 */
public class A054656 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  private boolean isPrimePartition(final int[] p) {
    for (final int v : p) {
      if (!mPrime.isPrime(v)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ZERO;
    }
    final boolean[] seen = new boolean[mN + 1];
    final DistinctPartsPartition part = new DistinctPartsPartition(mN);
    int[] p;
    while ((p = part.next()) != null) {
      if (isPrimePartition(p)) {
        for (final int v : p) {
          seen[v] = true;
        }
      }
    }
    int cnt = 0;
    for (long q = 2; q <= mN; q = mPrime.nextPrime(q)) {
      if (!seen[(int) q]) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

