package irvine.oeis.a018;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018935 a(n) is the smallest m whose square is the sum of n distinct positive squares.
 * @author Sean A. Irvine
 */
public class A018935 extends Sequence1 {

  private int mN = 0;
  private long mSumSquares;

  private static boolean isSolvable(final long s, final int n, final long b) {
    if (n == 0) {
      return s == 0;
    }
    long c = b + 1;
    long sq;
    while ((sq = c * c) <= s) {
      if (isSolvable(s - sq, n - 1, c)) {
        return true;
      }
      ++c;
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    mSumSquares += (long) mN * mN;
    long m = Functions.SQRT.l(mSumSquares);
    while (true) {
      if (isSolvable(m * m, mN, 0)) {
        return Z.valueOf(m);
      }
      ++m;
    }
  }
}

