package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034915 Primes of the form p^k - p + 1 for prime p.
 * @author Sean A. Irvine
 */
public class A034915 extends Sequence1 {

  private static final class State implements Comparable<State> {
    final Z mValue;
    final long mP;
    final int mK;

    private State(final long p, final int k) {
      final Z pr = Z.valueOf(p);
      mValue = pr.pow(k).subtract(p - 1);
      mP = p;
      mK = k;
    }

    @Override
    public int compareTo(final State o) {
      final int c = mValue.compareTo(o.mValue);
      if (c != 0) {
        return c;
      }
      return Long.compare(mP, o.mP);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && mValue.equals(((State) obj).mValue) && mP == ((State) obj).mP;
    }

    @Override
    public int hashCode() {
      return mValue.hashCode();
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private Z mPrev = Z.NEG_ONE;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.first().mValue.compareTo(mP) >= 0) {
        mP = mPrime.nextPrime(mP);
        mA.add(new State(mP.longValueExact(), 1));
      }
      final State s = mA.pollFirst();
      mA.add(new State(s.mP, s.mK + 1));
      if (s.mValue.equals(mPrev)) {
        continue;
      }
      mPrev = s.mValue;
      if (mPrev.isProbablePrime()) {
        return mPrev;
      }
    }
  }
}

