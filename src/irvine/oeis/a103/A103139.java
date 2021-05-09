package irvine.oeis.a103;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A103139 Woolbright sequence: the maximum number of kings on an n X n chessboard such that every single king is attacking a number of other kings that is smaller or equal to the number of empty spaces around it.
 * @author Sean A. Irvine
 */
public class A103139 implements Sequence {

  private static final int[] DELTAX = {1, -1, 0, 0, 1, -1, 1, -1};
  private static final int[] DELTAY = {0, 0, 1, -1, 1, -1, -1, 1};

  private int mN = 0;
  private int mKings = 0;
  private long[] mMasks;
  private int[] mNeighbourCount;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private boolean check(final int bit, final long pattern) {
    if ((pattern & (1L << bit)) == 0) {
      return true;
    }
    final long mask = mMasks[bit];
    final int kings = Long.bitCount(pattern & mask);
    return 2 * kings <= mNeighbourCount[bit];
  }

  private boolean isSolution(final long pattern) {
    for (int k = 0; k < mMasks.length; ++k) {
      if (!check(k, pattern)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN > 8) {
      throw new UnsupportedOperationException();
    }

    // For each square precompute which squares are adjacent in bit space,
    // and the number of such squares.
    mNeighbourCount = new int[mN * mN];
    mMasks = new long[mN * mN];
    for (int y = 0, j = 0; y < mN; ++y) {
      for (int x = 0; x < mN; ++x, ++j) {
        for (int k = 0; k < DELTAX.length; ++k) {
          final int nx = x + DELTAX[k];
          final int ny = y + DELTAY[k];
          if (nx >= 0 && nx < mN && ny >= 0 && ny < mN) {
            final int bit = ny * mN + nx;
            mMasks[j] |= 1L << bit;
          }
        }
        mNeighbourCount[j] = Long.bitCount(mMasks[j]);
      }
    }

    final long limit = 1L << (mN * mN);
    while (true) {
      if (mVerbose) {
        StringUtils.message("Trying for " + mKings + " kings");
      }
      boolean found = false;
      for (long pattern = (1L << mKings) - 1; pattern <= limit; pattern = LongUtils.swizzle(pattern)) {
        if (isSolution(pattern)) {
          found = true;
          break;
        }
      }
      if (!found) {
        return Z.valueOf(mKings - 1);
      }
      ++mKings;
    }
  }
}
