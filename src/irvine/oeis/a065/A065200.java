package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A065200 Numbers of the form n = m * p^k, with p prime, k &gt;= 0, m squarefree and p &gt; any prime factor of m.
 * @author Sean A. Irvine
 */
public class A065200 extends A005117 {

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final long mP;
    private final boolean mSinglePrime;

    private State(final Z n, final long p, final boolean single) {
      mN = n;
      mP = p;
      mSinglePrime = single;
    }

    @Override
    public int compareTo(final State state) {
      final int c = mN.compareTo(state.mN);
      if (c != 0) {
        return c;
      }
      final int d = Long.compare(mP, state.mP);
      if (d != 0) {
        return d;
      }
      return Boolean.compare(mSinglePrime, state.mSinglePrime);
    }
  }

  private final Fast mPrime = new Fast();
  private final TreeSet<State> mA = new TreeSet<>();
  {
    mA.add(new State(super.next(), 0, true));
  }
  private Z mM = super.next();
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (mM.compareTo(mA.first().mN) >= 0) {
        mA.add(new State(mM, 0, true));
        mM = super.next();
      }
      final State s = mA.pollFirst();
      if (s.mP == 0) {
        final long p = mPrime.nextPrime(Functions.GPF.l(s.mN));
        if (p > 1) {
          mA.add(new State(s.mN.multiply(p), p, true));
        }
      } else {
        mA.add(new State(s.mN.multiply(s.mP), s.mP, false));
        if (s.mSinglePrime) {
          final long q = mPrime.nextPrime(s.mP);
          mA.add(new State(s.mN.divide(s.mP).multiply(q), q, true));
        }
      }
      if (s.mN.compareTo(mPrev) > 0) {
        mPrev = s.mN;
        return mPrev;
      }
    }
  }
}
