package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Definite integral of a function with finite bounds.
 * WARNING: This method is not well tested and probably does not converge fast enough in most cases
 * @author Sean A. Irvine
 */
class DefiniteIntegral extends CR {

  private static final int EXTRA_PRECISION = 4;
  private final UnaryCrFunction mF;
  private final CR mLo;
  private final CR mLength;
  private final CR mFEdge;

  DefiniteIntegral(final UnaryCrFunction f, final CR lo, final CR hi) {
    mF = f;
    mLo = lo;
    mLength = hi.subtract(lo);
    mFEdge = f.execute(lo).add(f.execute(hi));
  }

  private final class Simpson extends CR {

    private final int mIntervals;

    private Simpson(final int intervals) {
      mIntervals = intervals;
    }

    @Override
    protected Z approximate(final int precision) {
      Z sum = Z.ZERO;
      final CR s = mLength.divide(mIntervals);
      for (int k = 1; k <= mIntervals / 2; ++k) {
        sum = sum.add(mF.execute(mLo.add(s.multiply(2L * k - 1))).multiply(CR.FOUR).getApprox(precision));
      }
      for (int k = 1; k < mIntervals / 2; ++k) {
        sum = sum.add(mF.execute(mLo.add(s.multiply(2L * k))).multiply(CR.TWO).getApprox(precision));
      }
      sum = sum.add(mFEdge.getApprox(precision));
      return sum;
    }
  }

  @Override
  protected Z approximate(final int precision) {
    final int p = precision - EXTRA_PRECISION;
    int intervals = 512; // in theory this could start at 1 or 2
    Z sum = Z.ZERO;
    while (true) {
      intervals *= 2;
      final Z s = new Simpson(intervals).multiply(mLength.divide(intervals)).divide(CR.THREE).getApprox(p);
      if (s.equals(sum)) {
        break;
      }
      sum = s;
    }
    return sum.shiftRight(EXTRA_PRECISION);
  }
}
