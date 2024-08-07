package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068655 Primes which are a concatenation of at least two consecutive primes.
 * @author Sean A. Irvine
 */
public class A068655 extends A000040 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final Z mP;

    private State(final Z n, final Z p) {
      mN = n;
      mP = p;
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      return mP.compareTo(state.mP);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mP.equals(other.mP);
    }

    @Override
    public int hashCode() {
      return mN.hashCode() + mP.hashCode();
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private Z mP = super.next();
  private Z mQ = new Z(mP.toString() + mPrime.nextPrime(mP));

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.first().mN.compareTo(mQ) >= 0) {
        mP = mPrime.nextPrime(mP);
        mA.add(new State(mQ, mP));
        mQ = new Z(mP.toString() + mPrime.nextPrime(mP));
      }
      final State s = mA.pollFirst();
      final Z q = mPrime.nextPrime(s.mP);
      mA.add(new State(new Z(s.mN.toString() + q), q));
      if (!s.mN.equals(mPrev) && s.mN.isProbablePrime()) {
        mPrev = s.mN;
        return mPrev;
      }
    }
  }
}
