package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A071794 a(n) is the smallest integer &gt; 0 that cannot be obtained from the integers {1, ..., n} using each number at most once and the operators +, -, *, /, ^.
 * @author Sean A. Irvine
 */
public class A071794 extends Sequence1 {

  // This is a terrible implementation of this sequence and could be incorrect for later terms

  private static final long LIMIT = 1L << 29;
  private int mN = 0;
  private long mMask = 0;
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long[] mStack = null;
  private long mM = 1;

  private void mark(final long value) {
    if (value > 0 && value <= LIMIT) {
      mSeen.set(value);
    }
  }

  private void search(final int sp, final long used) {
    if (used != mMask) {
      // There is at least one unused number
      for (int k = 1; k <= mN; ++k) {
        if ((used & (1L << k)) == 0) {
          mStack[sp + 1] = k;
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
      // ^
      if (b > 1 && b < LIMIT && Math.abs(a) > 1) {
        final Z t = Z.valueOf(a).pow(b);
        if (t.bitLength() < Long.SIZE) {
          mStack[sp - 1] = t.longValue();
          mark(mStack[sp - 1]);
          search(sp - 1, used);
        }
      }
      mStack[sp - 1] = a;
    }
  }

  @Override
  public Z next() {
    ++mN;
    mMask = ((1L << mN) - 1) & ~1; // 0 not used
    mStack = new long[mN + 1];
    // First two items must be numbers
    for (int k = 1; k <= mN; ++k) {
      mStack[0] = k;
      mark(k);
      for (int j = 1; j <= mN; ++j) {
        if (j != k) {
          mStack[1] = j;
          mark(j);
          search(1, (1L << j) + (1L << k));
        }
      }
    }
    // As n increases, the smallest unrepresentable number cannot ever decrease
    while (mSeen.isSet(mM)) {
      if (++mM > LIMIT) {
        throw new UnsupportedOperationException("Increase LIMIT to search harder");
      }
    }
    return Z.valueOf(mM);
  }
}
