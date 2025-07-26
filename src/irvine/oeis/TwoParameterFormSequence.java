package irvine.oeis;

import java.util.TreeSet;
import java.util.function.BiFunction;

import irvine.math.z.Z;

/**
 * Generate distinct numbers having a particular two parameter form.
 * @author Sean A. Irvine
 */
public class TwoParameterFormSequence extends AbstractSequence {

  private final class State implements Comparable<State> {
    private final Z mN;
    private final long mM;
    private final long mR;

    private State(final long m, final long r) {
      mM = m;
      mR = r;
      mN = mRule.apply(m, r);
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      return Long.compare(mR, state.mR);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mR == other.mR;
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }
  }

  // Rule to generate terms
  private final BiFunction<Long, Long, Z> mRule;
  // mA maintains terms yet to be output in numerical order
  private final TreeSet<State> mA = new TreeSet<>();
  // Used to suppress multiple outputs of the same term when there is more than representation
  private Z mPrev = null;

  /**
   * Construct a new sequence of numbers having a particular form.
   * @param offset offset of the sequence (usually 1)
   * @param m minimum valid value of first parameter
   * @param r minimum valid value of second parameter
   * @param rule rule to generate the value from <code>m</code> and <code>r</code>
   * (may return <code>null</code> if the combination of parameters is invalid)
   */
  protected TwoParameterFormSequence(final int offset, final long m, final long r, final BiFunction<Long, Long, Z> rule) {
    super(offset);
    mRule = rule;
    add(new State(m, r));
  }

  private void add(final State state) {
    if (state.mN != null) {
      mA.add(state);
    }
  }

  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return !n.equals(prev);
  }

  @Override
  public Z next() {
    while (true) {
      final State s = mA.pollFirst();
      add(new State(s.mM + 1, s.mR));
      add(new State(s.mM, s.mR + 1));
      if (accept(s.mM, s.mR, s.mN, mPrev)) {
        mPrev = s.mN;
        return mPrev;
      }
    }
  }
}
