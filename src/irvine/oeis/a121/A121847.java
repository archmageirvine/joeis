package irvine.oeis.a121;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A121847 The spiral parameter alpha for the icosahedral fullerenes.
 * @author Sean A. Irvine
 */
public class A121847 extends Sequence1 {

  protected static final class State implements Comparable<State> {
    protected final long mN;
    protected final long mI;
    protected final long mJ;

    private State(final long i, final long j) {
      mI = i;
      mJ = j;
      mN = i * i + i * j + j * j; // paper is 20 * this
    }

    @Override
    public int compareTo(final State state) {
      final int c = Long.compare(mN, state.mN);
      if (c != 0) {
        return c;
      }
      final int d = Long.compare(mI, state.mI);
      if (d != 0) {
        return d;
      }
      return Long.compare(mJ, state.mJ);
    }
  }

  private final TreeSet<State> mA = new TreeSet<>();
  {
    mA.add(new State(1, 0));
  }

  protected Z select(final State state) {
    // alpha
    final long i = state.mI;
    final long j = state.mJ;
    return Z.valueOf((5 * (i + j) * (i + j) - 5 * i - 3 * j - 2 + i * (j == 0 ? 2 : 0)) / 2);
  }

  @Override
  public Z next() {
    final State state = mA.pollFirst();
    if (state.mJ < state.mI) {
      mA.add(new State(state.mI, state.mJ + 1));
    }
    if (state.mJ == 0) {
      mA.add(new State(state.mI + 1, 0));
    }
    return select(state);
  }
}
