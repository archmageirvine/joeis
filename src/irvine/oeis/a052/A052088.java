package irvine.oeis.a052;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052088 Primes whose decimal expansion is a concatenation of two or more consecutive decreasing numbers (no leading zeros allowed).
 * @author Sean A. Irvine
 */
public class A052088 implements Sequence {

  static final class State implements Comparable<State> {
    private final Z mA;
    private final long mM;

    private State(final Z a, final long m) {
      mA = a;
      mM = m;
    }

    @Override
    public int compareTo(final State o) {
      final int c = mA.compareTo(o.mA);
      if (c != 0) {
        return c;
      }
      return Long.compare(mM, o.mM);
    }

    @Override
    public int hashCode() {
      return mA.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && ((State) obj).mA.equals(mA) && ((State) obj).mM == mM;
    }
  }

  private State mNext = new State(Z.valueOf(21), 1);
  private final TreeSet<State> mSet = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      while (mSet.isEmpty() || mNext.compareTo(mSet.first()) <= 0) {
        mSet.add(mNext);
        final long m = mNext.mM;
        mNext = new State(new Z(String.valueOf(m + 2) + (m + 1)), m + 1);
      }
      final State state = mSet.pollFirst();
      final Z n = state.mA;
      if (state.mM > 1) {
        mSet.add(new State(new Z(n.toString() + (state.mM - 1)), state.mM - 1));
      }
      if (n.isProbablePrime()) {
        return n;
      }
    }
  }
}

