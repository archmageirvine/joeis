package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034707 Numbers that are sums (of a nonempty sequence) of consecutive primes.
 * @author Sean A. Irvine
 */
public class A034707 implements Sequence {

  private static final class State implements Comparable<State> {
    final Z mValue;
    final long mLast;

    private State(final Z value, final long last) {
      mValue = value;
      mLast = last;
    }

    @Override
    public int compareTo(final State o) {
      final int c = mValue.compareTo(o.mValue);
      if (c != 0) {
        return c;
      }
      return Long.compare(mLast, o.mLast);
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private Z mPrev = Z.NEG_ONE;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.first().mValue.compareTo(mP) >= 0) {
        mP = mPrime.nextPrime(mP);
        mA.add(new State(mP, mP.longValueExact()));
      }
      final State s = mA.pollFirst();
      final long next = mPrime.nextPrime(s.mLast);
      mA.add(new State(s.mValue.add(next), next));
      if (s.mValue.equals(mPrev)) {
        continue;
      }
      mPrev = s.mValue;
      return s.mValue;
    }
  }
}

