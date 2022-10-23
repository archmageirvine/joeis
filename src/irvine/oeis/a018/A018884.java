package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A018884 Squares using at most two distinct digits, not ending in 0.
 * @author Sean A. Irvine
 */
public class A018884 extends Sequence1 {

  // Sequentially generate binary numbers of a given length, holding the initial
  // digit to be 0.  Replace (0,1) with (a,b).  Test if result is a square.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mBinary = -1;
  private long mLimit = 0;
  private int mLength = 1;
  private int mA = 0;
  private int mB = 0;
  private Z mPrev = Z.ZERO;

  protected boolean accept(final Z n) {
    return n.mod(10) != 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mBinary > mLimit) {
        mBinary = 0;
        if (++mB == 10) {
          mB = 0;
          if (++mA == 10) {
            mA = 0;
            mLimit = (mLimit << 1) | 1;
            if (++mLength > 63) {
              // Actually 64 might work as well
              throw new UnsupportedOperationException();
            }
            if (mVerbose) {
              StringUtils.message("Starting length " + mLength);
            }
          }
        }
      }
      if (mA != mB) {
        Z t = Z.ONE;
        Z n = Z.ZERO;
        long v = mBinary;
        for (int k = 0; k < mLength; ++k) {
          n = n.add(t.multiply((v & 1) == 0 ? mA : mB));
          t = t.multiply(10);
          v >>>= 1;
        }
        if (n.compareTo(mPrev) > 0 && accept(n) && n.isSquare()) {
          mPrev = n;
          return n;
        }
      }
    }
  }
}
