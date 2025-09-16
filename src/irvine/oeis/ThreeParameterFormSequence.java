package irvine.oeis;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * Generate distinct numbers having a particular three parameter form.
 * @author Sean A. Irvine
 */
public class ThreeParameterFormSequence extends AbstractSequence {

  @FunctionalInterface
  public interface TriFunction {
    /**
     * Apply the function.
     * @param m first parameter
     * @param r first parameter
     * @param s first parameter
     * @return function value
     */
    Z apply(Long m, final Long r, final Long s);
  }

  private final class State implements Comparable<State> {
    private final Z mN;
    private final long mM;
    private final long mR;
    private final long mS;

    private State(final long m, final long r, final long s) {
      mM = m;
      mR = r;
      mS = s;
      mN = mRule.apply(m, r, s);
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      final int d = Long.compare(mR, state.mR);
      if (d != 0) {
        return d;
      }
      return Long.compare(mS, state.mS);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mR == other.mR && mS == other.mS;
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }

    @Override
    public String toString() {
      return "(" + mM + "," + mR + "," + mS + ")=" + mN;
    }
  }

  // Rule to generate terms
  private final TriFunction mRule;
  // mA maintains terms yet to be output in numerical order
  private final TreeSet<State> mA = new TreeSet<>();
  // Used to suppress multiple outputs of the same term when there is more than representation
  private Z mPrev = null;

  /**
   * Construct a new sequence of numbers having a particular form.
   * @param offset offset of the sequence (usually 1)
   * @param m minimum valid value of first parameter
   * @param r minimum valid value of second parameter
   * @param s minimum valid value of third parameter
   * @param rule rule to generate the value from <code>m</code>, <code>r</code> and <code>s</code>
   * (may return <code>null</code> if the combination of parameters is invalid)
   */
  protected ThreeParameterFormSequence(final int offset, final long m, final long r, final long s, final TriFunction rule) {
    super(offset);
    mRule = rule;
    add(new State(m, r, s));
  }

  private void add(final State state) {
    if (state.mN != null) {
      mA.add(state);
    }
  }

  protected boolean accept(final long x, final long y, final long z, final Z n, final Z prev) {
    return !n.equals(prev);
  }

  @Override
  public Z next() {
    while (true) {
      final State s = mA.pollFirst();
      add(new State(s.mM + 1, s.mR, s.mS));
      add(new State(s.mM, s.mR + 1, s.mS));
      add(new State(s.mM, s.mR, s.mS + 1));
      if (accept(s.mM, s.mR, s.mS, s.mN, mPrev)) {
        mPrev = s.mN;
        return mPrev;
      }
    }
  }
}
