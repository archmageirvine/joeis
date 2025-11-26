package irvine.oeis.a387;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A390774 allocated for J. Lowell.
 * @author Sean A. Irvine
 */
public class A387946 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final long mLo;
    private final long mHi;
    private final Z mProd;
    private final Z mSum;
    private final Z mN;

    private State(final long lo, final long hi, final Z prod, final Z sum) {
      mLo = lo;
      mHi = hi;
      mProd = prod;
      mSum = sum;
      mN = prod.subtract(sum);
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      return mProd.compareTo(state.mProd);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mN.equals(other.mN) && mProd.equals(other.mProd);
    }

    @Override
    public int hashCode() {
      return mN.hashCode();
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private Z mPrev = Z.ZERO;
  private final TreeSet<State> mStates = new TreeSet<>();
  {
    mStates.add(new State(2, 3, Z.SIX, Z.FIVE));
  }

  @Override
  public Z next() {
    while (true) {
      final State state = mStates.pollFirst();
      final long p = mPrime.nextPrime(state.mLo);
      final long q = mPrime.nextPrime(state.mHi);
      final Z prod = state.mProd.multiply(q);
      final Z sum = state.mSum.add(q);
      mStates.add(new State(state.mLo, q, prod, sum)); // * q
      mStates.add(new State(p, q, prod.divide(state.mLo), sum.subtract(state.mLo))); // * q / p
      if (state.mN.equals(mPrev)) {
        if (mVerbose) {
          StringUtils.message(state.mN + " has more than one representation, one representation is: " + state.mLo + " .. " + state.mHi);
        }
      } else {
        mPrev = state.mN;
        return mPrev;
      }
    }
  }
}
