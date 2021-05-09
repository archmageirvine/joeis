package irvine.oeis.a103;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A103139.
 * @author Sean A. Irvine
 */
public class A103139 implements Sequence {

  private static final int[] DELTAX = {1, -1, 0, 0, 1, -1, 1, -1};
  private static final int[] DELTAY = {0, 0, 1, -1, 1, -1, -1, 1};

  private int mN = 0;
  private int mKings = 0;
  private boolean[][] mWorkspace;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private boolean check(final int x, final int y) {
    int bias = 0;
    if (mWorkspace[y][x]) {
      final int n = mWorkspace.length;
      for (int k = 0; k < DELTAX.length; ++k) {
        final int nx = x + DELTAX[k];
        final int ny = y + DELTAY[k];
        if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
          if (mWorkspace[ny][nx]) {
            ++bias;
          } else {
            --bias;
          }
        }
      }
    }
    return bias <= 0;
  }

  private static void printSolution(final boolean[][] board) {
    for (final boolean[] row : board) {
      for (final boolean t : row) {
        System.out.print(t ? "#" : ".");
      }
      System.out.println();
    }
  }

  private boolean isSolution(long pattern) {
    for (int y = 0; y < mWorkspace.length; ++y) {
      for (int x = 0; x < mWorkspace.length; ++x) {
        mWorkspace[y][x] = (pattern & 1) == 1;
        pattern >>>= 1;
      }
    }
    for (int y = 0; y < mWorkspace.length; ++y) {
      for (int x = 0; x < mWorkspace.length; ++x) {
        if (!check(x, y)) {
          return false;
        }
      }
    }
    if (mVerbose) {
      System.out.println("Accepted:");
      printSolution(mWorkspace);
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN > 8) {
      throw new UnsupportedOperationException();
    }
    final long limit = 1L << (mN * mN);
    mWorkspace = new boolean[mN][mN];

//    // For each square which squares are adjacent
//    final long[] masks = new long[mN * mN];
//    for (int y = 0, k = 0; y < mN; ++y) {
//      for (int x = 0; x < mN; ++x, ++k) {
//        for (int k = 0; k < DELTAX.length; ++k) {
//          final int nx = x + DELTAX[k];
//          final int ny = y + DELTAY[k];
//          if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
//            if (mWorkspace[ny][nx]) {
//              ++bias;
//            } else {
//              --bias;
//            }
//          }
//
//
//
//      }



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
