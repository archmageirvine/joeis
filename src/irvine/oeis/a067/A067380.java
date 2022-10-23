package irvine.oeis.a067;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A067380 Primes expressible as the sum of (at least two) consecutive primes in at least 4 ways.
 * @author Sean A. Irvine
 */
public class A067380 extends Sequence1 {

  private static final class State {
    final Z mValue;
    final int mLast;

    private State(final Z value, final int last) {
      mValue = value;
      mLast = last;
    }
  }

  private final TreeSet<State> mA = new TreeSet<>(Comparator.comparing((State o) -> o.mValue).thenComparingInt(o -> o.mLast));
  private final MemorySequence mSeq;
  private final int mMinTerms;
  private final int mMinReps;
  private int mN = 1;

  /**
   * Construct a sequence.
   * @param minTerms minimum number of terms in the sum
   * @param seq underlying sequences
   * @param minReps minimum number of representations
   */
  public A067380(final int minTerms, final MemorySequence seq, final int minReps) {
    mMinTerms = minTerms;
    mSeq = seq;
    mMinReps = minReps;
    mA.add(new State(starter(0), minTerms - 1)); // avoids need for isEmpty check later
  }

  /** Construct the sequence. */
  public A067380() {
    this(1, MemorySequence.cachedSequence(new A000040()), 4);
  }

  private Z starter(final int n) {
    Z sum = Z.ZERO;
    for (int k = 0; k < mMinTerms; ++k) {
      sum = sum.add(mSeq.a(n + k));
    }
    return sum;
  }

  private Z pull() {
    final State s = mA.pollFirst();
//    final long target = 311;
//    if (s.mValue.longValue() == target) {
//      final List<Long> terms = new ArrayList<>();
//      int k = s.mLast;
//      long sum = 0;
//      while (sum != target) {
//        final long t = mSeq.a(k--).longValue();
//        terms.add(t);
//        sum += t;
//      }
//      final StringBuilder sb = new StringBuilder();
//      Collections.reverse(terms);
//      for (final long v : terms) {
//        if (sb.length() > 0) {
//          sb.append('+');
//        }
//        sb.append(v);
//      }
//      sb.append(" = ").append(target);
//      System.out.println(sb);
//    }
    final int next = s.mLast + 1;
    mA.add(new State(s.mValue.add(mSeq.a(next)), next));
    return s.mValue;
  }

  @Override
  public Z next() {
    while (true) {
      Z starter;
      while (mA.first().mValue.compareTo(starter = starter(mN)) >= 0) {
        mA.add(new State(starter, mN + mMinTerms - 1));
        ++mN;
      }
      final Z s = pull();
      int c = s.isProbablePrime() ? 0 : 1;
      while (mA.first().mValue.equals(s)) {
        ++c;
        pull();
      }
      if (c >= mMinReps && s.isProbablePrime()) {
        return s;
      }
    }
  }
}

