package irvine.oeis.a076;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076614 Numbers of the form 2^k + 3^k + ... + p_n^k.
 * @author Sean A. Irvine
 */
public class A076614 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final long mP;
    private final long mK;

    private State(final Z n, final long p, final long k) {
      mN = n;
      mP = p;
      mK = k;
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      return Long.compare(mP, state.mP);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mP == other.mP && mK == other.mK;
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private Z mPrev = Z.ZERO;
  {
    mA.add(new State(Z.ZERO, 0, 1));
  }

  @Override
  public Z next() {
    while (true) {
      final State s = mA.pollFirst();
      final long p = mPrime.nextPrime(s.mP);
      mA.add(new State(s.mN.add(Z.valueOf(p).pow(s.mK)), p, s.mK));
      if (s.mP == 2) {
        mA.add(new State(s.mN.multiply2(), 2, s.mK + 1));
      }
      if (!s.mN.equals(mPrev)) {
        mPrev = s.mN;
        return mPrev;
      }
    }
  }
}
