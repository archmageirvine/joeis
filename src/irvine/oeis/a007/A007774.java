package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007774 Numbers that are divisible by exactly 2 different primes; numbers n with omega(n) = A001221(n) = 2.
 * @author Sean A. Irvine
 */
public class A007774 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final long mP;
    private final long mQ;
    private final long mE;
    private final long mF;
    private final Z mN;

    private State(final long p, final long q, final long e, final long f) {
      mP = p;
      mQ = q;
      mE = e;
      mF = f;
      mN = Z.valueOf(mP).pow(mE).multiply(Z.valueOf(mQ).pow(mF));
    }

    @Override
    public int compareTo(final State state) {
      return mN.compareTo(state.mN); // representations are unique
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && ((State) obj).mN.equals(mN);
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }
  }

  private final Fast mPrime = new Fast();
  private final TreeSet<State> mS = new TreeSet<>();
  {
    mS.add(new State(2, 3, 1, 1));
  }

  @Override
  public Z next() {
    final State state = mS.pollFirst();
    mS.add(new State(state.mP, state.mQ, state.mE + 1, state.mF));
    mS.add(new State(state.mP, state.mQ, state.mE, state.mF + 1));
    if (state.mE == 1 && state.mF == 1) {
      mS.add(new State(state.mP, mPrime.nextPrime(state.mQ), 1, 1));
      final long r = mPrime.nextPrime(state.mP);
      if (r < state.mQ) {
        mS.add(new State(r, state.mQ, 1, 1));
      }
    }
    return state.mN;
  }
}
