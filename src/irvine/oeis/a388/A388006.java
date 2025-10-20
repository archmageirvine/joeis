package irvine.oeis.a388;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388006 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A388006 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final Q mSum;
    private final int mPrimeIndex;
    private final int mE;

    private State(final Z n, final Q sum, final int primeIndex, final int e) {
      mN = n;
      mSum = sum;
      mPrimeIndex = primeIndex;
      mE = e;
    }

    @Override
    public int compareTo(final State state) {
      return mN.compareTo(state.mN);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && ((State) obj).mN.equals(mN);
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }

    @Override
    public String toString() {
      return mN + " (" + mSum + ")";
    }
  }

  private final TreeSet<State> mStates = new TreeSet<>();
  {
    mStates.add(new State(Z.ONE, Q.ZERO, 0, 0));
  }

  @Override
  public Z next() {
    while (true) {
      final State s = mStates.pollFirst();
      // Bump previous power
      if (s.mE != 0) {
        // This will always make the sum smaller than it was
        final long p = Functions.PRIME.l(s.mPrimeIndex);
        mStates.add(new State(s.mN.multiply(p), s.mSum.subtract(new Q(s.mPrimeIndex, s.mE)).add(new Q(s.mPrimeIndex, s.mE + 1)), s.mPrimeIndex, s.mE + 1));
        // Replace previous last prime with the next prime of the same exponent
        final long q = Functions.PRIME.l(s.mPrimeIndex + 1);
        final Q sum = s.mSum.subtract(new Q(s.mPrimeIndex, s.mE)).add(new Q(s.mPrimeIndex + 1, s.mE));
        if (sum.compareTo(Q.ONE) <= 0) {
          mStates.add(new State(s.mN.divide(Z.valueOf(p).pow(s.mE)).multiply(Z.valueOf(q).pow(s.mE)), sum, s.mPrimeIndex + 1, s.mE));
        }
      }
      if (s.mSum.equals(Q.ONE)) {
        return s.mN;
      }
      // Add next prime into the mix
      int k = s.mPrimeIndex + 1;
      // We want sum + k/e <= 1
      int e = Q.valueOf(k).divide(Q.ONE.subtract(s.mSum)).toZ().intValueExact();
      if (s.mSum.add(new Q(k, e)).compareTo(Q.ONE) > 0) {
        ++e;
      }
      mStates.add(new State(s.mN.multiply(Functions.PRIME.z(k).pow(e)), s.mSum.add(new Q(k, e)), s.mPrimeIndex + 1, e));
    }
  }
}

