package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394360 Smallest number that can be written as the sum of n distinct primes in at least n different ways.
 * @author Sean A. Irvine (with ChatGPT)
 */
public class A394360 extends Sequence1 {

  private int mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    ++mN;
    // Special case
    if (mN == 1) {
      return Z.TWO; // 2 itself
    }

    int limit = 10 * mN * mN; // heuristic upper bound (safe, grows if needed)
    while (true) {
      // dp[k][s] = number of ways (capped at mN)
      final int[][] dp = new int[mN + 1][limit + 1];
      dp[0][0] = 1;

      // generate primes up to limit
      for (long p = 2; p <= limit; p = mPrime.nextPrime(p)) {
        final int prime = (int) p;
        // reverse loops for distinctness
        for (int k = mN; k >= 1; --k) {
          for (int s = limit; s >= prime; --s) {
            if (dp[k - 1][s - prime] > 0) {
              dp[k][s] += dp[k - 1][s - prime];
            }
          }
        }
      }

      // find smallest s with at least mN representations
      for (int s = 0; s <= limit; ++s) {
        if (dp[mN][s] >= mN) {
          return Z.valueOf(s);
        }
      }

      // increase limit and retry
      limit *= 2;
    }
  }
}
