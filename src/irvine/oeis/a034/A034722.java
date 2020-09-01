package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034722 Products of successive Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A034722 implements Sequence {

  private static final class State implements Comparable<State> {
    final Z mValue;
    final int mLast;

    private State(final Z value, final int last) {
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
  private Z mF = Z.ONE;
  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.first().mValue.compareTo(mF) >= 0) {
        mF = Fibonacci.fibonacci(++mN);
        mA.add(new State(mF, mN));
      }
      final State s = mA.pollFirst();
      final int next = s.mLast + 1;
      mA.add(new State(s.mValue.multiply(Fibonacci.fibonacci(next)), next));
      if (s.mValue.equals(mPrev)) {
        continue;
      }
      mPrev = s.mValue;
      return s.mValue;
    }
  }
}

