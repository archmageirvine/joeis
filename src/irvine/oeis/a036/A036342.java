package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036342 Prime concatenated analog clock numbers read clockwise.
 * @author Sean A. Irvine
 */
public class A036342 implements Sequence {

  static final class State implements Comparable<State> {
    final Z mA;
    final int mClock;

    State(final Z a, final int clock) {
      mA = a;
      mClock = clock;
    }

    @Override
    public int compareTo(final State o) {
      final int c = mA.compareTo(o.mA);
      if (c != 0) {
        return c;
      }
      return Integer.compare(mClock, o.mClock);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State o = (State) obj;
      return mClock == o.mClock && mA.equals(o.mA);
    }

    @Override
    public int hashCode() {
      return mA.hashCode() * mClock;
    }
  }

  private final TreeSet<State> mState = new TreeSet<>();
  {
    for (int k = 1; k <= 12; ++k) {
      mState.add(new State(Z.valueOf(k), k));
    }
  }

  @Override
  public Z next() {
    while (true) {
      final State s = mState.pollFirst();
      int next = s.mClock + 1;
      if (next == 13) {
        next = 1;
      }
      mState.add(new State(new Z(s.mA.toString() + next), next));
      if (s.mA.isProbablePrime()) {
        return s.mA;
      }
    }
  }
}
