package irvine.oeis;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * Multiplicative closure formed by products of distinct elements of a strictly increasing sequence.
 * @author Sean A. Irvine
 */
public class DistinctMultiplicativeClosureSequence implements Sequence {

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

  protected DistinctMultiplicativeClosureSequence(final Sequence seq) {
    mSeq = MemorySequence.cachedSequence(seq);
    mA.add(new State(Z.ONE, -1));
  }

  @Override
  public Z next() {
    while (true) {
      final State state = mA.pollFirst();
      final Z n = state.mN;
      final int index = state.mIndex;
      final Z t = n.multiply(mSeq.a(index + 1));
      mA.add(new State(t, index + 1));
      if (index >= 0) {
        mA.add(new State(t.divide(mSeq.a(index)), index + 1));
      }
      if (!n.equals(mPrev)) {
        mPrev = n;
        return n;
      }
    }
  }
}
