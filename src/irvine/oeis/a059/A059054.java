package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059054 Integers which can be written as (b^k+1)/(b+1) for positive integers b and k.
 * @author Sean A. Irvine
 */
public class A059054 implements Sequence {

  private static final class State implements Comparable<State> {
    private final Z mB;
    private final long mE;
    private final Z mN;

    private State(final Z b, final long e) {
      mB = b;
      mE = e;
      mN = b.pow(e).add(1).divide(b.add(1));
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      return mB.compareTo(state.mB);
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private Z mPrev = Z.ONE;
  private State mS = new State(Z.THREE, 3);

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(new State(Z.TWO, 3));
      return Z.ONE;
    }
    while (true) {
      while (mA.first().mN.compareTo(mS.mN) >= 0) {
        mA.add(mS);
        mS = new State(mS.mB.add(1), 3);
      }
      final State res = mA.pollFirst();
      mA.add(new State(res.mB, res.mE + 2));
      if (!res.mN.equals(mPrev)) {
        mPrev = res.mN;
        return mPrev;
      }
    }
  }
}
