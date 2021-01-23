package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034840 Concatenation of 3 or more numbers in arithmetic progression.
 * @author Sean A. Irvine
 */
public class A034840 implements Sequence {

  private static final class State implements Comparable<State> {
    private final Z mValue;
    private final long mStart;
    private final long mDifference;
    private final int mCount;

    private State(final Z value, final long start, final long difference, final int count) {
      mValue = value;
      mStart = start;
      mDifference = difference;
      mCount = count;
    }

    @Override
    public int compareTo(final State o) {
      final int c = mValue.compareTo(o.mValue);
      if (c != 0) {
        return c;
      }
      final int c0 = Long.compare(mStart, o.mStart);
      if (c0 != 0) {
        return c0;
      }
      final int c1 = Long.compare(mDifference, o.mDifference);
      if (c1 != 0) {
        return c1;
      }
      return Integer.compare(mCount, o.mCount);
    }

    @Override
    public int hashCode() {
      return mValue.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State
        && mValue.equals(((State) obj).mValue)
        && mDifference == ((State) obj).mDifference
        && mStart == ((State) obj).mStart
        && mCount == ((State) obj).mCount;
    }

    @Override
    public String toString() {
      return "(" + mValue + "," + mStart + "," + mDifference + "," + mCount + ")";
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private long mNextStart = 1;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mNextStart <= mA.first().mValue.longValueExact()) {
        for (long d = -mNextStart / 2; d <= mNextStart; ++d) {
          mA.add(new State(Z.valueOf(mNextStart), mNextStart, d, 1));
        }
        for (long s = 1; s < mNextStart; ++s) {
          mA.add(new State(Z.valueOf(s), s, mNextStart, 1));
        }
        ++mNextStart;
      }
      final State state = mA.pollFirst();
      final long t = state.mStart + state.mCount * state.mDifference;
      if (t >= 0) {
        mA.add(new State(new Z(state.mValue + String.valueOf(t)), state.mStart, state.mDifference, state.mCount + 1));
      }
      if (state.mCount >= 3) {
        if (state.mValue.compareTo(mPrev) > 0) {
          mPrev = state.mValue;
          return state.mValue;
        }
      }
    }
  }
}
