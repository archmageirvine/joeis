package irvine.oeis.a392;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000796;
import irvine.util.array.LongDynamicArray;

/**
 * A392893 Number of distinct nonempty substrings in the first 10^n digits of the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A392893 extends Sequence0 {

  private static final class State {
    private long mLen;
    private long mLink;
    private final long[] mNext = new long[10]; // digits 0..9

    private State() {
      Arrays.fill(mNext, -1);
    }
  }

  private static final class SuffixAutomaton {
    private final LongDynamicArray<State> mStates = new LongDynamicArray<>();
    private long mSz;
    private long mLast;

    private SuffixAutomaton() {
      final State s0 = new State();
      s0.mLink = -1;
      mStates.set(0, s0);
      mSz = 1;
      mLast = 0;
    }

    private void extend(final int c) {
      final long cur = mSz++;
      final State sc = new State();
      mStates.set(cur, sc);
      sc.mLen = mStates.get(mLast).mLen + 1;

      long p = mLast;
      while (p != -1 && mStates.get(p).mNext[c] == -1) {
        mStates.get(p).mNext[c] = cur;
        p = mStates.get(p).mLink;
      }

      if (p == -1) {
        mStates.get(cur).mLink = 0;
      } else {
        final long q = mStates.get(p).mNext[c];
        if (mStates.get(p).mLen + 1 == mStates.get(q).mLen) {
          mStates.get(cur).mLink = q;
        } else {
          final long clone = mSz++;
          mStates.set(clone, new State());
          System.arraycopy(mStates.get(q).mNext, 0, mStates.get(clone).mNext, 0, 10);
          mStates.get(clone).mLen = mStates.get(p).mLen + 1;
          mStates.get(clone).mLink = mStates.get(q).mLink;
          while (p != -1 && mStates.get(p).mNext[c] == q) {
            mStates.get(p).mNext[c] = clone;
            p = mStates.get(p).mLink;
          }
          mStates.get(q).mLink = mStates.get(cur).mLink = clone;
        }
      }
      mLast = cur;
    }

    private Z distinctSubstrings() {
      Z res = Z.ZERO;
      for (long i = 1; i < mSz; ++i) {
        res = res.add(mStates.get(i).mLen - mStates.get(mStates.get(i).mLink).mLen);
      }
      return res;
    }
  }

  private long mN = 0;
  private long mM = 0;
  private final Sequence mPi = new A000796();
  private final SuffixAutomaton mSam = new SuffixAutomaton();

  @Override
  public Z next() {
    mN = mN == 0 ? 1 : mN * 10;
    while (mM < mN) {
      mSam.extend(mPi.next().intValue());
      ++mM;
    }
    return mSam.distinctSubstrings();
  }
}
