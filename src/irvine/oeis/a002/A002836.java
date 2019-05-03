package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002836 Let <code>F(x) = 1 + x + 4x^2 + 10x^3 +</code> ... = g.f. for <code>A000293</code> (solid partitions) and expand <code>(1-x)(1-x^2)(1-x^3)...*F(x)</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A002836 implements Sequence {

  private int mN = -1;
  protected long[] mD = new long[0];
  /** Number of columns in give plane, row. */
  private int[][] mCC = null;
  /** Number of rows in given plane. */
  private int[] mRR = null;
  /** Row of given move. */
  private int[] mRow = null;
  /** Plane of given move. */
  private int[] mPlane = null;
  /** Recursion depth. */
  private int mDepth = 0;
  /** Number of planes. */
  protected int mPP = 0;
  /** Current plane. */
  protected int mP = 0;
  /** Current row. */
  private int mR = 0;

  private boolean again() {
    if (mR > 0) {
      --mR;
      return true;
    }
    if (mP > 0) {
      mR = mRR[--mP];
      return true;
    }
    return false;
  }

  private boolean nope() {
    while (--mDepth > 0) {
      mP = mPlane[mDepth];
      mR = mRow[mDepth];
      final int c = mCC[mP][mR] - 1;
      mCC[mP][mR] = c;
      if (c == 0) {
        mRR[mP]--;
      }
      if (mR + c == 0) {
        --mPP;
      }
      if (again()) {
        return false;
      }
    }
    return true;
  }

  protected boolean shouldBeCounted() {
    return mP + mR > 0;
  }


  /**
   * The number of topological sequences of index <code>i</code> for
   * 0&lt;=<code>i</code>&lt;=<code>m</code>.  Based on backtracking
   * algorithm due to Knuth.
   *
   * @param n an <code>int</code> value
   */
  private void count(final int n) {
    mD = new long[n + 1];
    mCC = new int[n + 1][n + 1];
    mRR = new int[n + 1];
    mRow = new int[n + 1];
    mPlane = new int[n + 1];
    // partial sum for index
    final int[] index = new int[n + 1];

    mPP = 0;
    mDepth = 0;
    mD[0] = 1;

    while (true) {
      ++mDepth;
      mP = mPP;
      mR = 0;
      while (true) {
        final int c = mCC[mP][mR];
        if ((mP > 0 && mCC[mP - 1][mR] <= c) || (mR > 0 && mCC[mP][mR - 1] <= c)) {
          if (!again() && nope()) {
            return;
          } else {
            continue;
          }
        }
        final int t;
        if (mP < mPlane[mDepth - 1] || (mP == mPlane[mDepth - 1] && mR < mRow[mDepth - 1])) {
          t = index[mDepth - 1] + mDepth - 1;
          if (mDepth + t > n) {
            if (nope()) {
              return;
            } else {
              continue;
            }
          }
        } else {
          t = index[mDepth - 1];
        }
        // We have chosen (mP,mR,c) as the mDepth-th element of the topological sequence
        index[mDepth] = t;
        if (shouldBeCounted()) {
          mD[mDepth + t]++;
        }
        if (t + mDepth >= n) {
          if (!again() && nope()) {
            return;
          } else {
            continue;
          }
        }
        if (mR + c == 0) {
          ++mPP;
        }
        if (c == 0) {
          mRR[mP]++;
        }
        mCC[mP][mR] = c + 1;
        mPlane[mDepth] = mP;
        mRow[mDepth] = mR;
        break;
      }
    }
  }

  @Override
  public Z next() {
    if (++mN >= mD.length) {
      count(mN + 5);
    }
    return Z.valueOf(mD[mN]);
  }
}

