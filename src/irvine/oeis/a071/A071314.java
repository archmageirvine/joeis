package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A071314 a(n) is the smallest number that cannot be obtained from the numbers {2^0,2^1,...,2^n} using each number at most once and the operators +, -, *, /. Parentheses are allowed, intermediate fractions are not allowed.
 * @author Sean A. Irvine
 */
public class A071314 extends Sequence0 {

  private static final long LIMIT = 1L << 29;
  private int mN = 0;
  private long mMask = 0;
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long[] mStack = null;
  private long mM = 2;

  private void mark(final long value) {
    if (value > 0 && value <= LIMIT) {
      mSeen.set(value);
    }
  }

  private void search(final int sp, final long used) {
    if (used != mMask) {
      // There is at least one unused number
      for (int k = 0; k < mN; ++k) {
        if ((used & (1L << k)) == 0) {
          mStack[sp + 1] = 1L << k;
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
      // / (intermediate expressions must be integers)
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
      mStack[0] = 1L << k;
      mark(k);
      for (int j = 0; j < mN; ++j) {
        if (j != k) {
          mStack[1] = 1L << j;
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
