package irvine.oeis.a013;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013927 Begin with 2n cards in n piles of 2, the piles being {1,1},{2,2},{3,3},...,{n,n}. How many transpositions of adjacent (single) cards are needed to reverse the order of the piles?.
 * @author Sean A. Irvine
 */
public class A013927 extends Sequence1 {

  // After Bert Dobbelaere

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mBestMoves = 0;
  private int[][] mD2Home;

  private static class State {
    private int mLastK = 0;
    private int mLastD = 0;
    private final int[] mCard;

    private State(final int n) {
      mCard = new int[2 * n];
    }

    private State(final State s) {
      mLastK = s.mLastK;
      mLastD = s.mLastD;
      mCard = Arrays.copyOf(s.mCard, s.mCard.length);
    }
  }

  private State[] mTrace;


  private void dumptrace(final int lvl) {
    for (int l = 0; l <= lvl; l++) {
      for (int k = 0; k < mN; k++) {
        System.out.printf("{%d,%d} ", mTrace[l].mCard[2 * k], mTrace[l].mCard[2 * k + 1]);
      }
      System.out.println();
    }
    System.out.printf("(swap count = %d)\n\n", lvl);
  }

  /* Lower bound on required number of steps to reach target */
  private int dist2target(final State s) {
    int d = 0;
    for (int k = 0; k < mN; k++) {
      d += mD2Home[k][s.mCard[2 * k]];
      d += mD2Home[k][s.mCard[2 * k + 1]];
    }
    return (d + 1) / 2;
  }


  private void solve(final int lvl) {
    int d = mTrace[lvl].mLastD;
    if (lvl + d >= mBestMoves) {
      return;
    }

    if (d == 0) {
      if (mVerbose) {
        dumptrace(lvl);
      }
      mBestMoves = lvl;
      return;
    }

    int kstart = mTrace[lvl].mLastK - 1; // Ordering: if consecutive swapped pairs are independent, let lowest k come first
    if (kstart < 1) {
      kstart = 1;
    }

    for (int k = kstart; k < mN; k++) {
      for (int i = 0; i < 2; i++) {
        if (i < 1 || mTrace[lvl].mCard[2 * k - 2] != mTrace[lvl].mCard[2 * k - 1]) {
          for (int j = 0; j < 2; j++) {
            if (j < 1 || mTrace[lvl].mCard[2 * k] != mTrace[lvl].mCard[2 * k + 1]) {
              final State s = new State(mTrace[lvl]);
              final int z = s.mCard[2 * k - 2 + i];
              s.mCard[2 * k - 2 + i] = s.mCard[2 * k + j];
              s.mCard[2 * k + j] = z;

              // Empirically just ">" does it faster, alas could not prove optimality (yet).
              if (s.mCard[2 * k - 2 + i] != s.mCard[2 * k + j]) {
                final int newd = dist2target(s);
                s.mLastK = k;
                s.mLastD = newd;
                mTrace[lvl + 1] = s;
                solve(lvl + 1);
              }
            }
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final int max = mN * (mN - 1) + 1; /* Worst case: twice bubble sort, add 1 to ensure we can improve at least once */
    mBestMoves = max;
    mD2Home = new int[mN][mN + 1];
    mTrace = new State[max + 1];
    final State s = new State(mN);
    for (int x = 0; x < mN; x++) {
      for (int y = 1; y < mN + 1; y++) {
        mD2Home[x][y] = Math.abs(y - (mN - x));
      }
    }
    for (int k = 0; k < mN; k++) {
      s.mCard[2 * k] = k + 1;
      s.mCard[2 * k + 1] = k + 1;
    }
    s.mLastK = -1;
    s.mLastD = dist2target(s);
    mTrace[0] = s;
    solve(0);
    return Z.valueOf(mBestMoves);
  }
}

