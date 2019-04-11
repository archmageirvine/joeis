package irvine.oeis.a019;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019654 Consider problem of placing N queens on <code>an n</code> X n board so that each queen attacks precisely k others. Here k=4 and sequence gives number of different solutions when N takes its maximal value.
 * @author Sean A. Irvine
 */
public class A019654 implements Sequence {

  // Placing queens so that they attack a precise number of other queens.
  // In general, we want to count the number of solutions for the maximal number of queens
  // that satisfy the other constraints.
  //
  // Solutions are built up incrementally by adding queens one at a time, truncating the
  // search whenever a violation of some constraint is detected.
  //
  // We keep track of the number of queens attacking each square on the board; in fact,
  // we actually use bit sets so we can also tell the directions those attacks are
  // coming from.  This makes it easier to incrementally add a new queen.
  //
  // Partially inspired by C code by Manfred Scheucher
  // todo make this its own class

  // todo this is too slow to be much use ...

  private static final int QUEEN_BIT = 1 << 9; // first 8 bits used for directions

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mSize = 0;
  private int mExactAttack = 0;
  private long mMaximalQueens = 0;
  private long mMaximalCount = 0;
  // Follow arrays used to avoid churn
  private int[] mWorkspace1 = null;
  private int[] mWorkspace2 = null;

  private int get(final int[] attacks, final int x, final int y) {
    return attacks[y * mSize + x];
  }

  private void set(final int[] attacks, final int x, final int y, final int v) {
    attacks[y * mSize + x] = v;
  }

  private void or(final int[] attacks, final int x, final int y, final int bit) {
    attacks[y * mSize + x] |= bit;
  }

  private int pop(final int[] attacks, final int x, final int y) {
    return Integer.bitCount(get(attacks, x, y) & 0xFF); // mask out queen bit
  }

  private int compare(final int[] board1, final int[] board2) {
    for (int k = 0; k < board1.length; ++k) {
      final int c = Integer.compare(board1[k] & QUEEN_BIT, board2[k] & QUEEN_BIT);
      if (c != 0) {
        return c;
      }
    }
    return 0;
  }

  private void flip(final int[] src, final int[] dest) {
    for (int y = 0; y < mSize; ++y) {
      for (int x = 0; x < mSize; ++x) {
        set(dest, y, x, get(src, x, y));
      }
    }
  }

  private void rotate(final int[] src, final int[] dest) {
    for (int y = 0; y < mSize; ++y) {
      for (int x = 0; x < mSize; ++x) {
        set(dest, mSize - 1 - y, x, get(src, x, y));
      }
    }
  }

  private boolean isCanonical(final int[] board) {
    // rotate 90
    rotate(board, mWorkspace1);
    if (compare(board, mWorkspace1) > 0) {
      return false;
    }

    // rotate 180
    rotate(mWorkspace1, mWorkspace2);
    if (compare(board, mWorkspace2) > 0) {
      return false;
    }

    // rotate 270
    rotate(mWorkspace2, mWorkspace1);
    if (compare(board, mWorkspace1) > 0) {
      return false;
    }

    // mirrored 0
    flip(board, mWorkspace1);
    if (compare(board, mWorkspace1) > 0) {
      return false;
    }

    // mirrored 90
    rotate(mWorkspace1, mWorkspace2);
    if (compare(board, mWorkspace2) > 0) {
      return false;
    }

    // mirrored 180
    rotate(mWorkspace2, mWorkspace1);
    if (compare(board, mWorkspace1) > 0) {
      return false;
    }

    // mirrored 270
    rotate(mWorkspace1, mWorkspace2);
    if (compare(board, mWorkspace2) > 0) {
      return false;
    }

    return true;
  }

  private boolean markAndCheck(final int[] attacks, final int x0, final int y0, final int dx, final int dy, final int bit) {
    // Placing queen at (x0,y0), fail if the count for an existing queen goes too high
    for (int x = x0 + dx, y = y0 + dy; x >= 0 && y >= 0 && x < mSize && y < mSize; x += dx, y += dy) {
      or(attacks, x, y, bit);
      final int sq = get(attacks, x, y);
      if (sq >= QUEEN_BIT && Integer.bitCount(sq & 0xFF) > mExactAttack) {
        return false;
      }
    }
    return true;
  }

  private boolean isExact(final int[] attacks) {
    // Check that each queen attacks the required number of other queens, this
    // is actually done by checking that each queen is attacked by the required
    // number of queens.
    for (final int v : attacks) {
      if (v >= QUEEN_BIT && Integer.bitCount(v & 0xFF) != mExactAttack) {
        return false;
      }
    }
    return true;
  }

  private String dump(final int[] attacks) {
    final StringBuilder sb = new StringBuilder();
    for (final int attack : attacks) {
      sb.append(attack >= QUEEN_BIT ? "Q" : ".");
    }
    return sb.toString();
  }

  private void search(final int[] attacks, final int queen, final int x, final int y, final int remaining) {
    if (y >= mSize) {
      // Search is done
      if (queen >= mMaximalQueens && isExact(attacks)) {
        if (isCanonical(attacks)) {
          if (queen > mMaximalQueens) {
            mMaximalQueens = queen;
            mMaximalCount = 1;
            if (mVerbose) {
              System.out.println("Maximal queens now " + mMaximalQueens);
            }
          } else {
            ++mMaximalCount;
          }
          if (mVerbose) {
            System.out.println("Search: queens=" + queen + " " + dump(attacks));
          }
        }
      }
      return;
    }
    if (remaining < mMaximalQueens - queen) {
      return; // Insufficient remaining squares to achieve current best
    }
    if (x >= mSize) {
      // Move to next row
      search(attacks, queen, 0, y + 1, remaining);
      return;
    }
    // Consider placing at queen at (x,y)
    if (pop(attacks, x, y) > mExactAttack) {
      return; // This square attacked by too many queens
    }
    final int[] newBits = Arrays.copyOf(attacks, attacks.length);
    // Mark all consequences by expanding in all 8 directions from (x,y)
    or(newBits, x, y, QUEEN_BIT);
    if (markAndCheck(newBits, x, y, 1, 0, 1)
      && markAndCheck(newBits, x, y, -1, 0, 2)
      && markAndCheck(newBits, x, y, 0, 1, 4)
      && markAndCheck(newBits, x, y, 0, -1, 8)
      && markAndCheck(newBits, x, y, 1, 1, 16)
      && markAndCheck(newBits, x, y, 1, -1, 32)
      && markAndCheck(newBits, x, y, -1, 1, 64)
      && markAndCheck(newBits, x, y, -1, -1, 128)) {
      // Placement looks ok, try another queen
      search(newBits, queen + 1, x + 1, y, remaining - 1);
    }
    search(attacks, queen, x + 1, y, remaining - 1);
  }

  private long solve(final int n, final int attack) {
    if (mVerbose) {
      System.out.println("Solving for board size " + n);
    }
    mSize = n;
    mMaximalQueens = 1; // It could be argued that placing no queens is a solution -- but we avoid that here for consistency with the OEIS
    if (attack == 4 && n > 5) {
      // Known result from theory, see A063724
      mMaximalQueens = 3 * n - 3;
    }
    mMaximalCount = 0;
    mExactAttack = attack;
    mWorkspace1 = new int[n * n];
    mWorkspace2 = new int[n * n];
    search(new int[n * n], 0, 0, 0, n * n);
    return mMaximalCount;
  }

  private int mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(solve(++mN, 4));
  }
}
