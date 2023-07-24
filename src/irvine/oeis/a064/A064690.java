package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A064690 Define a sequence of fractions by x(m+1) = (x(m)^2+x(m)-1)/(x(m)+1) with x(1)=1; sequences gives values of n such that sgn(x(n))&lt;&gt;sgn(x(n-1)).
 * @author Sean A. Irvine
 */
public class A064690 extends Sequence1 {

  // After Kevin Ryde
  // https://user42.tuxfamily.org/temporary/a064690.gp

  // Iterate x -> x - 1/(x+1) with x represented by a fixed-point
  // interval lo,hi
  //
  //     lo/f <= x <= hi/f    with f = 2^num_bits
  //
  // When the current precision is exhausted, then the precision
  // is double the calculation started again.
  //
  // 12000 bits of precision is enough to find the block of terms
  // starting a(1192) = 5222759.
  //
  // The step calculation for the new lo wants to subtract the
  // biggest 1/(x+1) of the interval, which means the smallest
  // x+1 and hence "lo" there.  Conversely, the new hi uses the
  // "hi" there.

  private static final int PROGRESS_STEPS = 100000;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mNumBits = 100;
  private Z mF = Z.ONE.shiftLeft(mNumBits);
  private Z mF2 = Z.ONE.shiftLeft(2L * mNumBits);
  private long mN = 0;
  private Z mLo = mF;
  private Z mHi = mF;
  private int mPrevSign = 1;
  private long mLastOutput = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mVerbose && mN % PROGRESS_STEPS == 0) {
        StringUtils.message("Search completed to " + mN + " at precision " + mNumBits + " bits");
      }
      mLo = mLo.subtract(mF2.divide(mLo.add(mF)).add(1));     // - ceil(f2/(lo+f))
      mHi = mHi.subtract(mF2.divide(mHi.add(mF)));         // - floor(f2/(hi+f))
      if (mHi.signum() != mLo.signum()) {
        // Precision was exhausted, double the precision and recompute the initial portion
        StringUtils.message("Increasing lo precision to " + mNumBits + " bits");
        mNumBits *= 2;
        mF = Z.ONE.shiftLeft(mNumBits);
        mF2 = Z.ONE.shiftLeft(2 * mNumBits);
        mLo = mF;
        mHi = mF;
        mN = 0;
        mPrevSign = 1;
      }
      if (mLo.signum() != mPrevSign) {
        mPrevSign = mLo.signum();
        if (mN > mLastOutput) {
          mLastOutput = mN;
          return Z.valueOf(mN);
        }
      }
    }
  }
}
