package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068537 Numbers which can be written as the sum of 2 like powers (x^n + y^n; n&gt;1 &amp; x,y&gt;0).
 * @author Sean A. Irvine
 */
public class A068537 extends Sequence1 {

  private static final class State implements Comparable<State> {

    private final Z mN;
    private final long mX;
    private final long mY;
    private final long mK;

    private State(final long x, final long y, final long k) {
      mX = x;
      mY = y;
      mK = k;
      mN = Z.valueOf(x).pow(k).add(Z.valueOf(y).pow(k));
    }

    @Override
    public int compareTo(final State state) {
      final int cn = mN.compareTo(state.mN);
      if (cn != 0) {
        return cn;
      }
      final int cx = Long.compare(mX, state.mX);
      if (cx != 0) {
        return cx;
      }
      return Long.compare(mY, state.mY);
    }
  }

  private Z mPrev = Z.ZERO;
  private long mX = 1;
  private Z mX2 = Z.TWO;
  private final TreeSet<State> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.first().mN.compareTo(mX2) >= 0) {
        for (long y = 1; y <= mX; ++y) {
          mA.add(new State(mX, y, 2));
        }
        mX2 = Z.valueOf(++mX).square().add(1);
      }
      final State s = mA.pollFirst();
      if (!s.mN.equals(Z.TWO)) {
        mA.add(new State(s.mX, s.mY, s.mK + 1));
      }
      if (!s.mN.equals(mPrev)) {
        mPrev = s.mN;
        return mPrev;
      }
    }
  }
}

