package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034706 Numbers which are sums of consecutive triangular numbers.
 * @author Sean A. Irvine
 */
public class A034706 implements Sequence {

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
  private Z mT = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.first().mValue.compareTo(mT) >= 0) {
        mT = Z.valueOf(++mN).multiply(mN + 1).divide2();
        mA.add(new State(mT, mN));
      }
      final State s = mA.pollFirst();
      final long next = s.mLast + 1;
      mA.add(new State(s.mValue.add(Z.valueOf(next).multiply(next + 1).divide2()), next));
      if (s.mValue.equals(mPrev)) {
        continue;
      }
      mPrev = s.mValue;
      return s.mValue;
    }
  }
}

