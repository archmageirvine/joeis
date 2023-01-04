package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060863 Positive numbers n which are the average of a run of consecutive primes.
 * @author Sean A. Irvine
 */
public class A060863 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final Z mSum;
    private final long mNumTerms;
    private final Z mP;

    private State(final Z sum, final long numTerms, final Z p) {
      mSum = sum;
      mNumTerms = numTerms;
      mP = p;
    }

    @Override
    public int compareTo(final State state) {
      final int c = mSum.multiply(state.mNumTerms).compareTo(state.mSum.multiply(mNumTerms));
      if (c != 0) {
        return c;
      }
      return mP.compareTo(state.mP);
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  {
    // Add an initial state to avoid isEmpty checks later
    mA.add(new State(Z.TWO, 1, Z.TWO));
  }
  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (mA.first().mSum.compareTo(mP) >= 0) {
        mA.add(new State(mP, 1, mP));
        mP = mPrime.nextPrime(mP);
      }
      final State state = mA.pollFirst();
      final Z sum = state.mSum;
      final long terms = state.mNumTerms;
      final Z q = mPrime.nextPrime(state.mP);
      mA.add(new State(sum.add(q), terms + 1, q));
      if (sum.mod(terms) == 0) {
        final Z res = sum.divide(terms);
        if (!mPrev.equals(res)) {
          // Some terms (e.g. 5) can occur more than 1 way
          mPrev = res;
          return sum.divide(terms);
        }
      }
    }
  }
}
