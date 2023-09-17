package irvine.oeis.a065;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.memory.MemorySequence;

/**
 * A065867 Primes which are the sum of a prime number of consecutive primes.
 * @author Sean A. Irvine
 */
public class A065867 extends AbstractSequence {

  protected static final class State {
    private final Z mValue;
    private final int mLast;
    private final int mNumTerms;

    private State(final Z value, final int last, final int numTerms) {
      mValue = value;
      mLast = last;
      mNumTerms = numTerms;
    }

    public Z getValue() {
      return mValue;
    }

    public int getLast() {
      return mLast;
    }

    public int getNumTerms() {
      return mNumTerms;
    }
  }

  private final TreeSet<State> mA = new TreeSet<>(Comparator.comparing((State o) -> o.mValue).thenComparingInt(o -> o.mLast).thenComparingInt(o -> o.mNumTerms));
  protected final MemorySequence mSeq;
  private final int mMinTerms;
  private Z mPrev = Z.NEG_ONE;
  private int mN = 1;
  private final Fast mPrime = new Fast();

  protected A065867(final int minTerms, final MemorySequence seq) {
    super(1);
    mMinTerms = minTerms;
    mSeq = seq;
    mA.add(new State(starter(0), minTerms - 1, minTerms)); // avoids need for isEmpty check later
  }

  /** Construct the sequence. */
  public A065867() {
    this(2, MemorySequence.cachedSequence(new A000040()));
  }

  private Z starter(final int n) {
    Z sum = Z.ZERO;
    for (int k = 0; k < mMinTerms; ++k) {
      sum = sum.add(mSeq.a(n + k));
    }
    return sum;
  }

  protected boolean accept(final State s) {
    return mPrime.isPrime(s.mValue) && mPrime.isPrime(s.mNumTerms);
  }

  @Override
  public Z next() {
    while (true) {
      Z starter;
      while (mA.first().mValue.compareTo(starter = starter(mN)) >= 0) {
        mA.add(new State(starter, mN + mMinTerms - 1, mMinTerms));
        ++mN;
      }
      final State s = mA.pollFirst();
      final int next = s.mLast + 1;
      mA.add(new State(s.mValue.add(mSeq.a(next)), next, s.mNumTerms + 1));
      if (s.mValue.equals(mPrev)) {
        continue;
      }
      if (accept(s)) {
        mPrev = s.mValue;
        return s.mValue;
      }
    }
  }
}

