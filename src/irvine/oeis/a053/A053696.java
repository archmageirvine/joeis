package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053696 Numbers that can be represented as a string of three or more 1's in a base &gt;= 2.
 * @author Sean A. Irvine
 */
public class A053696 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final int mBase;

    private State(final Z n, final int base) {
      mN = n;
      mBase = base;
    }

    @Override
    public int compareTo(final State o) {
      final int c = mN.compareTo(o.mN);
      if (c != 0) {
        return c;
      }
      return Long.compare(mBase, o.mBase);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && ((State) obj).mN.equals(mN) && ((State) obj).mBase == mBase;
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private int mBase = 2;

  private Z threeOnes(final int base) {
    return Z.valueOf(base).add(1).multiply(base).add(1);
  }

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.first().mN.compareTo(threeOnes(mBase)) > 0) {
        mA.add(new State(threeOnes(mBase), mBase));
        ++mBase;
      }
      final State s = mA.pollFirst();
      mA.add(new State(s.mN.multiply(s.mBase).add(1), s.mBase));
      if (!s.mN.equals(mPrev)) {
        mPrev = s.mN;
        return mPrev;
      }
    }
  }
}
