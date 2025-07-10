package irvine.oeis.a078;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078668 Primes that are the difference between two powers: y^z - x^z = prime.
 * @author Sean A. Irvine
 */
public class A078668 extends A000040 {

  // todo doesn't currently match data

  private static class State implements Comparable<State> {
    private final long mBase;
    private final int mExponent;
    private final Z mN;

    private State(final long base, final int exponent) {
      mBase = base;
      mExponent = exponent;
      mN = Z.valueOf(base + 1).pow(exponent).subtract(Z.valueOf(base).pow(exponent));
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      return Long.compare(mBase, state.mBase);
    }

    @Override
    public String toString() {
      return mN + " = " + (mBase + 1) + "^" + mExponent + " - " + mBase + "^" + mExponent;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mBase == other.mBase;
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }
  }

  private Z mPrev = Z.ZERO;
  private final TreeSet<State> mS = new TreeSet<>();

  @Override
  public Z next() {
    if (mS.isEmpty()) {
      mS.add(new State(1, 2));
      return Z.TWO;
    }
    while (true) {
      final State state = mS.pollFirst();
      if (state.mExponent == 2 && state.mBase <= 29) {
        mS.add(new State(state.mBase + 1, 2));
      }
      if (state.mBase > 1) {
        mS.add(new State(state.mBase, state.mExponent + 1));
      }
      if (!state.mN.equals(mPrev) && state.mN.isProbablePrime()) {
        //System.out.println(state);
        mPrev = state.mN;
        return state.mN;
      }
    }
  }
}

