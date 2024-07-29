package irvine.oeis.a071;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A060315 a(1)=1; a(n) is the smallest positive integer that cannot be obtained from the integers {0, 1, ..., n-1} using each number at most once and the operators +, -, *, /.
 * @author Sean A. Irvine
 */
public class A071603 extends Sequence1 {

  // This could be better

  private static final long LIMIT = 1L << 29;
  private int mN = 0;
  private long mMask = 0;
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final HashSet<Long> mLarge = new HashSet<>();
  private long[] mStack = null;
  private long mCount = 1;
  {
    mSeen.set(1);
  }

  private void mark(final long value) {
    if (value > LIMIT) {
      if (mLarge.add(value)) {
        ++mCount;
      }
    }
    if (value > 0 && value <= LIMIT) {
      if (!mSeen.isSet(value)) {
        ++mCount;
      }
      mSeen.set(value);
    }
  }

  private void search(final int sp, final long used) {
    if (used != mMask) {
      // There is at least one unused number
      for (int k = 0; k < mN; ++k) {
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
      // /
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
    mMask = (1L << mN) - 1;
    mStack = new long[mN + 1];
    // First two items must be numbers
    for (int k = 0; k < mN; ++k) {
      mStack[0] = k;
      mark(k);
      for (int j = 0; j < mN; ++j) {
        if (j != k) {
          mStack[1] = j;
          mark(j);
          search(1, (1L << j) + (1L << k));
        }
      }
    }
    return Z.valueOf(mCount);
  }
}
