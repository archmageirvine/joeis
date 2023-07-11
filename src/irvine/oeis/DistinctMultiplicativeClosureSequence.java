package irvine.oeis;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * Multiplicative closure formed by products of distinct elements of a strictly increasing sequence.
 * @author Sean A. Irvine
 */
public class DistinctMultiplicativeClosureSequence extends AbstractSequence {

  private static final int DEFOFF = 1;

  private static final class State implements Comparable<State> {
    private final Z mN;
    private final int mIndex;

    private State(final Z n, final int index) {
      mN = n;
      mIndex = index;
    }

    @Override
    public int compareTo(final State o) {
      final int c = mN.compareTo(o.mN);
      if (c != 0) {
        return c;
      }
      return Integer.compare(mIndex, o.mIndex);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && ((State) obj).mN.equals(mN) && ((State) obj).mIndex == mIndex;
    }

    @Override
    public int hashCode() {
      return mN.hashCode() + mIndex;
    }
  }

  private final MemorySequence mSeq;
  private final TreeSet<State> mA = new TreeSet<>();
  private Z mPrev = null;

  protected DistinctMultiplicativeClosureSequence(final int offset, final Sequence seq, final Z initial) {
    super(offset);
    mSeq = MemorySequence.cachedSequence(seq);
    mA.add(new State(initial, -1));
  }

  protected DistinctMultiplicativeClosureSequence(final int offset, final Sequence seq) {
    this(offset, seq, Z.ONE);
  }

  protected DistinctMultiplicativeClosureSequence(final Sequence seq, final Z initial) {
    this(DEFOFF, seq, initial);
  }

  protected DistinctMultiplicativeClosureSequence(final Sequence seq) {
    this(DEFOFF, seq, Z.ONE);
  }

  protected Z op(final Z a, final Z b) {
    return a.multiply(b);
  }

  protected Z invOp(final Z a, final Z b) {
    return a.divide(b);
  }

  @Override
  public Z next() {
    while (true) {
      final State state = mA.pollFirst();
      final Z n = state.mN;
      final int index = state.mIndex;
      final Z t = op(n, mSeq.a(index + 1));
      mA.add(new State(t, index + 1));
      if (index >= 0) {
        mA.add(new State(invOp(t, mSeq.a(index)), index + 1));
      }
      if (!n.equals(mPrev)) {
        mPrev = n;
        return n;
      }
    }
  }
}
