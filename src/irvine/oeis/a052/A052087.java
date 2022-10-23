package irvine.oeis.a052;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052087 Primes whose decimal expansion is a concatenation of two or more consecutive increasing numbers (no leading zeros allowed).
 * @author Sean A. Irvine
 */
public class A052087 extends Sequence1 {

  private static final class State implements Comparable<State> {
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

  private State mNext = new State(Z.valueOf(23), 3);
  private final TreeSet<State> mSet = new TreeSet<>();
  {
    mSet.add(new State(Z.valueOf(12), 2));
  }

  @Override
  public Z next() {
    while (true) {
      while (mNext.compareTo(mSet.first()) <= 0) {
        mSet.add(mNext);
        final long m = mNext.mM;
        mNext = new State(new Z(String.valueOf(m) + (m + 1)), m + 1);
      }
      final State state = mSet.pollFirst();
      final Z n = state.mA;
      mSet.add(new State(new Z(n.toString() + (state.mM + 1)), state.mM + 1));
      if (n.isProbablePrime()) {
        return n;
      }
    }
  }
}

