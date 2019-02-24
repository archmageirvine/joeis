package irvine.oeis.a018;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018937.
 * @author Sean A. Irvine
 */
public class A018937 implements Sequence {

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
    mSumSquares += mN * mN;
    long m = LongUtils.sqrt(mSumSquares);
    while (true) {
      final long soln = leastSolution(m * m, mN, 0);
      if (soln != Long.MAX_VALUE) {
        return Z.valueOf(soln);
      }
      ++m;
    }
  }
}

