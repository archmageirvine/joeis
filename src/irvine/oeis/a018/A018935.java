package irvine.oeis.a018;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018935.
 * @author Sean A. Irvine
 */
public class A018935 implements Sequence {

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
    mSumSquares += mN * mN;
    long m = LongUtils.sqrt(mSumSquares);
    while (true) {
      if (isSolvable(m * m, mN, 0)) {
        return Z.valueOf(m);
      }
      ++m;
    }
  }
}

