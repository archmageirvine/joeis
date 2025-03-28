package irvine.oeis.a381;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A381736 allocated for Matthew Goers.
 * @author Sean A. Irvine
 */
public class A381736 extends Sequence2 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final Z mP;
    private final Z mQ;
    private final Z mR;

    private State(final Z p, final Z q, final Z r) {
      mP = p;
      mQ = q;
      mR = r;
      mN = p.multiply(q).multiply(r);
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

  private final Fast mPrime = new Fast();
  private final TreeSet<State> mA = new TreeSet<>();
  {
    mA.add(new State(Z.TWO, Z.THREE, Z.FIVE));
  }


  @Override
  public Z next() {
    while (true) {
      final State s = mA.pollFirst();
      final Z np = mPrime.nextPrime(s.mP);
      final Z nq = mPrime.nextPrime(s.mQ);
      if (np.compareTo(s.mQ) < 0) {
        mA.add(new State(np, s.mQ, s.mR));
      }
      if (nq.compareTo(s.mR) < 0) {
        mA.add(new State(s.mP, nq, s.mR));
      }
      mA.add(new State(s.mP, s.mQ, mPrime.nextPrime(s.mR)));
      if (s.mP.multiply(s.mQ).compareTo(s.mR) > 0) {
        return s.mN;
      }
    }
  }
}
