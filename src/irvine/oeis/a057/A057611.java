package irvine.oeis.a057;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057611 Let m = 3, 5, 7, ..., k = 0, 1, 2, 3, ..., z = (m+1)/2, 0 &lt; j &lt;= m. Let n_j be a prime number. Sequence gives T(m,k) = Table[m,k] = number of solutions to Sum_{d=1,2, ..., (z+k)}(n_j)_d = Sum_{d=1,2, ..., (z-k-1)}(n_j)_d = primorial number (A002110).
 * @author Sean A. Irvine
 */
public class A057611 implements Sequence {

  private final Fast mPrime = new Fast();
  private final long[] mCounts = new long[100];
  private long mP = 2;
  private int mN = 0;
  private int mM = 0;

  private void search(final long sum, final long p, final int subtractions) {
    final long q = mPrime.prevPrime(p);
    if (q < 2) {
      if (sum == 0) {
        ++mCounts[subtractions];
      }
      return;
    }
    search(sum - q, q, subtractions + 1);
    search(sum + q, q, subtractions);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mP = mPrime.nextPrime(mPrime.nextPrime(mP)); // Must always have odd number of primes
      Arrays.fill(mCounts, 0);
      search(mP, mP, 0);
      mM = 1;
    }
    return Z.valueOf(mCounts[mN - mM + 1] + mCounts[mN + mM]);
  }
}
