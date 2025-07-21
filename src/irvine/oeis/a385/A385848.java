package irvine.oeis.a385;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence1;

/**
 * A385848 Numbers not of the form 2^m*k + m + 1, for integers m, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A385848 extends ComplementSequence {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final long mM;
    private final long mK;

    private State(final long m, final long k) {
      mM = m;
      mK = k;
      mN = Z.valueOf(k).shiftLeft(m).add(m + 1);
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      return Long.compare(mK, state.mK);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mK == other.mK;
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }
  }

  /** Construct the sequence. */
  public A385848() {
    super(1, new Sequence1() {
      private final TreeSet<State> mA = new TreeSet<>();
      {
        mA.add(new State(1, 1));
      }

      @Override
      public Z next() {
        final State s = mA.pollFirst();
        mA.add(new State(s.mM + 1, s.mK));
        mA.add(new State(s.mM, s.mK + 1));
        return s.mN;
      }
    }, Z.ONE);
  }
}
