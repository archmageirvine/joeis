package irvine.oeis.a018;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018937 Let S be the smallest square that is the sum of n distinct positive integers. Then a(n) is the smallest k such that there exist n distinct positive integers &lt;= k whose squares sum to S.
 * @author Sean A. Irvine
 */
public class A018937 extends Sequence1 {

  private int mN = 0;
  private long mSumSquares;

  static long leastSolution(final long s, final int n, final long b) {
    if (n == 0) {
      return s == 0 ? b : Long.MAX_VALUE;
    }
    long c = b + 1;
    long sq;
    long soln = Long.MAX_VALUE;
    while ((sq = c * c) <= s) {
      soln = Math.min(soln, leastSolution(s - sq, n - 1, c));
      if (++c >= soln) {
        return soln;
      }
    }
    return soln;
  }

  @Override
  public Z next() {
    ++mN;
    mSumSquares += (long) mN * mN;
    long m = Functions.SQRT.l(mSumSquares);
    while (true) {
      final long soln = leastSolution(m * m, mN, 0);
      if (soln != Long.MAX_VALUE) {
        return Z.valueOf(soln);
      }
      ++m;
    }
  }
}

