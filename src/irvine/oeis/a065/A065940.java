package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000408;

/**
 * A065940 Integers of the form bc/a + ac/b + ab/c, where a,b,c are positive integers.
 * @author Sean A. Irvine
 */
public class A065940 extends A000408 {

  private static class State implements Comparable<State> {
    private final Z mN;
    private final Z mA;

    private State(final Z n, final Z a) {
      mN = n;
      mA = a;
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      return mA.compareTo(state.mA);
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private Z mNext = super.next();
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.first().mN.compareTo(mNext) >= 0) {
        mA.add(new State(mNext, mNext));
        mNext = super.next();
      }
      final State s = mA.pollFirst();
      mA.add(new State(s.mN.add(s.mA), s.mA));
      if (!s.mN.equals(mPrev)) {
        mPrev = s.mN;
        return mPrev;
      }
    }
  }
}
