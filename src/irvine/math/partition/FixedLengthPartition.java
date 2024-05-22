package irvine.math.partition;

import irvine.math.function.Functions;

/**
 * Generated fixed length partitions.
 * @author Sean A. Irvine
 */
public final class FixedLengthPartition {

  private final int mN;
  private final int mParts;
  private final int mLo;
  private final int mHi;
  private final int mMax;
  private boolean mFirst = true;
  private FixedLengthPartition mP = null;
  private int mI;

  /**
   * Construct a new object for getting the integer partitions of a number.
   * @param n number
   * @param parts number of parts
   * @param lo minimum value
   * @param hi maximum value
   */
  public FixedLengthPartition(final int n, final int parts, final int lo, final int hi) {
    mN = n;
    mParts = parts;
    mLo = lo;
    mHi = hi;
    if (parts >= 2) {
      mI = Functions.MAX.i(lo, (n + parts - 1) / parts, n - hi * (parts - 1));
      mMax = Math.min(hi, n - (parts - 1) * lo);
    } else {
      mMax = 0;
    }
  }

  /**
   * Construct a new object for getting the integer partitions of a number.
   * @param n number
   * @param parts number of parts
   * @param lo minimum value
   */
  public FixedLengthPartition(final int n, final int parts, final int lo) {
    this(n, parts, lo, n);
  }

  /**
   * Construct a new object for getting the integer partitions of a number.
   * @param n number
   * @param parts number of parts
   */
  public FixedLengthPartition(final int n, final int parts) {
    this(n, parts, 1);
  }

  /**
   * Return the next partition or null if all partitions have been produced.
   * @return integer partition or null if no further partition exist
   */
  public int[] next() {
    if (mParts == 0 && mN == 0) {
      if (mFirst) {
        mFirst = false;
        return new int[0];
      }
    } else if (mParts == 1 && mN >= mLo) {
      if (mFirst) {
        mFirst = false;
        return mN <= mHi ? new int[] {mN} : null;
      }
    } else if (mParts >= 2) {
      if (mI > mMax) {
        return null;
      }
      while (mI <= mMax) {
        if (mP == null) {
          mP = new FixedLengthPartition(mN - mI, mParts - 1, mLo, mI);
        }
        final int[] p = mP.next();
        if (p == null) {
          mP = null;
          ++mI;
        } else {
          final int[] res = new int[mParts];
          res[0] = mI;
          System.arraycopy(p, 0, res, 1, p.length);
          return res;
        }
      }
    }
    return null;
  }
}
