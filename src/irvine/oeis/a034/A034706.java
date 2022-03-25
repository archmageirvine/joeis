package irvine.oeis.a034;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A034706 Numbers which are sums of consecutive triangular numbers.
 * @author Sean A. Irvine
 */
public class A034706 implements Sequence {

  protected static final class State {
    private final Z mValue;
    private final int mLast;

    private State(final Z value, final int last) {
      mValue = value;
      mLast = last;
    }

    public Z getValue() {
      return mValue;
    }

    public int getLast() {
      return mLast;
    }

  }

  private final TreeSet<State> mA = new TreeSet<>(Comparator.comparing((State o) -> o.mValue).thenComparingInt(o -> o.mLast));
  protected final MemorySequence mSeq;
  private final int mMinTerms;
  private Z mPrev = Z.NEG_ONE;
  private int mN = 1;

  protected A034706(final int minTerms, final MemorySequence seq) {
    mMinTerms = minTerms;
    mSeq = seq;
    mA.add(new State(starter(0), minTerms - 1)); // avoids need for isEmpty check later
  }

  /** Construct the sequence. */
  public A034706() {
    this(1, MemorySequence.cachedSequence(new A000217()));
  }

  private Z starter(final int n) {
    Z sum = Z.ZERO;
    for (int k = 0; k < mMinTerms; ++k) {
      sum = sum.add(mSeq.a(n + k));
    }
    return sum;
  }

  protected boolean accept(final State s) {
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      Z starter;
      while (mA.first().mValue.compareTo(starter = starter(mN)) >= 0) {
        mA.add(new State(starter, mN + mMinTerms - 1));
        ++mN;
      }
      final State s = mA.pollFirst();
      final int next = s.mLast + 1;
      mA.add(new State(s.mValue.add(mSeq.a(next)), next));
      if (s.mValue.equals(mPrev)) {
        continue;
      }
      mPrev = s.mValue;
      if (accept(s)) {
        return s.mValue;
      }
    }
  }
}

