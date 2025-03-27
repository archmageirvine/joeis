package irvine.oeis.a382;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A382211 Prime of the form p^q + q^r + r^p, for primes p, q and r.
 * @author Sean A. Irvine
 */
public class A382211 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final Z mP;
    private final Z mQ;
    private final Z mR;

    private State(final Z p, final Z q, final Z r) {
      mP = p;
      mQ = q;
      mR = r;
      mN = p.pow(q).add(q.pow(r)).add(r.pow(p));
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      final int d = mP.compareTo(state.mP);
      if (d != 0) {
        return d;
      }
      final int e = mQ.compareTo(state.mQ);
      if (e != 0) {
        return e;
      }
      return mR.compareTo(state.mR);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mP.equals(other.mP) && mQ.equals(other.mQ) && mR.equals(other.mR);
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private final TreeSet<State> mA = new TreeSet<>();
  {
    mA.add(new State(Z.TWO, Z.TWO, Z.TWO));
  }
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final State s = mA.pollFirst();
      if (s.mP.compareTo(s.mQ) < 0 && s.mP.compareTo(s.mR) < 0) { // WLOG assume p smallest
        mA.add(new State(mPrime.nextPrime(s.mP), s.mQ, s.mR));
      }
      mA.add(new State(s.mP, mPrime.nextPrime(s.mQ), s.mR));
      mA.add(new State(s.mP, s.mQ, mPrime.nextPrime(s.mR)));
      if (!s.mN.equals(mPrev) && s.mN.isProbablePrime()) {
        mPrev = s.mN;
        if (mVerbose) {
          StringUtils.message(s.mN + " (" + s.mP + "," + s.mQ + "," + s.mR + ")");
        }
        return s.mN;
      }
    }
  }
}
