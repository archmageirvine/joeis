package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076645 Irregular triangle read by rows of ways to write 0 as 1 +- 2 +- 3 +- 4 +- ... +- k for some k, where signs alternate except that there is one instance of two consecutive positive terms.
 * @author Sean A. Irvine
 */
public class A076645 extends Sequence1 {

  private static final class State {
    private final State mParent;
    private final long mSum;
    private final long mPrev;
    private final boolean mConsecutivePositive;

    private State(final State parent, final long prev, final boolean consecutivePositive) {
      mParent = parent;
      mSum = parent == null ? 1 : parent.mSum + prev;
      mPrev = prev;
      mConsecutivePositive = consecutivePositive;
    }
  }

  private List<State> mStates = Collections.singletonList(new State(null, 1, false));
  private final List<Long> mRow = new ArrayList<>();
  private int mM = 0;
  private int mN = -1;

  private void stateToList(State state) {
    mRow.clear();
    while (state != null) {
      mRow.add(state.mPrev);
      state = state.mParent;
    }
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      while (true) {
        if (++mN >= mStates.size()) {
          final List<State> next = new ArrayList<>();
          for (final State s : mStates) {
            next.add(new State(s, -(s.mPrev + Long.signum(s.mPrev)), s.mConsecutivePositive));
            if (!s.mConsecutivePositive && s.mPrev > 0) {
              next.add(new State(s, s.mPrev + 1, true));
            }
          }
          mStates = next;
          mN = 0;
        }
        if (mStates.get(mN).mSum == 0) {
          stateToList(mStates.get(mN));
          mM = mRow.size() - 1;
          break;
        }
      }
    }
    return Z.valueOf(mRow.get(mM));
  }
}
