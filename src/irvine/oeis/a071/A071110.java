package irvine.oeis.a071;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071110 a(n) is the smallest integer &gt;=0 we cannot obtain from n, n+1, n+2, n+3, n+4 and the operators +, -, *, /, using each number only once.
 * @author Sean A. Irvine
 */
public class A071110 extends Sequence0 {

  private static final int LIMIT = 1 << 9; // Largest known term is 258
  private static final int MAX_ADD = 4;
  private static final long MASK = 0b11111;
  private int mN = -1;
  private final boolean[] mSeen = new boolean[LIMIT];
  private long[] mStack = null;

  private void mark(final long value) {
    if (value >= 0 && value < LIMIT) {
      mSeen[(int) value] = true;
    }
  }

  private void search(final int sp, final long used) {
    if (used != MASK) {
      // There is at least one unused number
      for (int k = 0; k <= MAX_ADD; ++k) {
        if ((used & (1L << k)) == 0) {
          mStack[sp + 1] = mN + k;
          search(sp + 1, used | (1L << k));
        }
      }
    }
    if (sp >= 1) {
      final long a = mStack[sp - 1];
      final long b = mStack[sp];
      // +
      mStack[sp - 1] = a + b;
      mark(mStack[sp - 1]);
      search(sp - 1, used);
      // -
      if (a >= b) { // This seems to be a valid assumption
        mStack[sp - 1] = a - b;
        mark(mStack[sp - 1]);
        search(sp - 1, used);
      }
      // *
      mStack[sp - 1] = a * b;
      mark(mStack[sp - 1]);
      search(sp - 1, used);
      // / (It seems sufficient to ignore fractions)
      if (b != 0 && a % b == 0) {
        mStack[sp - 1] = a / b;
        mark(mStack[sp - 1]);
        search(sp - 1, used);
      }
      mStack[sp - 1] = a;
    }
  }

  @Override
  public Z next() {
    ++mN;
    Arrays.fill(mSeen, false);
    mStack = new long[MAX_ADD + 1];
    // First two items must be numbers
    for (int k = 0; k <= MAX_ADD; ++k) {
      mStack[0] = k + mN;
      mark(k + mN);
      for (int j = 0; j <= MAX_ADD; ++j) {
        if (j != k) {
          mStack[1] = j + mN;
          mark(j + mN);
          search(1, (1L << j) + (1L << k));
        }
      }
    }
    int u = 0;
    while (mSeen[u]) {
      if (++u == mSeen.length) {
        throw new UnsupportedOperationException("Increase LIMIT to search harder");
      }
    }
    return Z.valueOf(u);
  }
}
