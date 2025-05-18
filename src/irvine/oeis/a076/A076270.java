package irvine.oeis.a076;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076270 Numbers of the form (3^{mr}-1)/(3^r-1) for positive integers m, r.
 * @author Sean A. Irvine
 */
public class A076270 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final long mM;
    private final long mR;

    private State(final Z base, final long m, final long r) {
      mM = m;
      mR = r;
      final Z t = base.pow(r);
      mN = t.pow(m).subtract(1).divide(t.subtract(1));
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

  private final Z mBase;
  private final TreeSet<State> mA = new TreeSet<>();

  protected A076270(final Z base) {
    mBase = base;
    mA.add(new State(base, 1, 1));
  }

  /** Construct the sequence. */
  public A076270() {
    this(Z.THREE);
  }

  @Override
  public Z next() {
    final State s = mA.pollFirst();
    mA.add(new State(mBase, s.mM + 1, s.mR));
    if (s.mM != 1) {
      mA.add(new State(mBase, s.mM, s.mR + 1));
    }
    return s.mN;
  }
}
