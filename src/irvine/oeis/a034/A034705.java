package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034705 Numbers that are sums of consecutive squares.
 * @author Sean A. Irvine
 */
public class A034705 implements Sequence {

  private static final class State implements Comparable<State> {
    final Z mValue;
    final long mLast;

    private State(final Z value, final long last) {
      mValue = value;
      mLast = last;
    }

    @Override
    public int compareTo(final State o) {
      final int c = mValue.compareTo(o.mValue);
      if (c != 0) {
        return c;
      }
      return Long.compare(mLast, o.mLast);
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private Z mPrev = Z.NEG_ONE;
  private long mN = -1;
  private Z mS = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.first().mValue.compareTo(mS) >= 0) {
        mS = Z.valueOf(++mN).square();
        mA.add(new State(mS, mN));
      }
      final State s = mA.pollFirst();
      final long next = s.mLast + 1;
      mA.add(new State(s.mValue.add(Z.valueOf(next).square()), next));
      if (s.mValue.equals(mPrev)) {
        continue;
      }
      mPrev = s.mValue;
      return s.mValue;
    }
  }
}

