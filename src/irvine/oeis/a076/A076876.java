package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.Collections;

import irvine.math.z.Z;
import irvine.oeis.a005.A005316;
import irvine.util.Pair;

/**
 * A076876 Meandric numbers for a river crossing two parallel roads at n points.
 * @author Andrew Howroyd
 * @author Sean A. Irvine (Java port)
 */
public class A076876 extends A005316 {

  private int mN = -2;

  /**
   * Processing component for meanders with multiple parallel roads (A076876, A206432, A204352, etc).
   * Can also handle loops on multiple parallel roads (A086031).
   */
  protected static class ParallelRoadsMeanderProblem extends MeanderProblem implements StateMachine<Pair<Integer, Z>> {
    private final Z mLimit;
    private final int mMaxRoads;
    private final boolean mIsPath;
    private final int mRemaining;
    private final int mSign;

    public ParallelRoadsMeanderProblem(final int remaining, final int maxRoads, final boolean isPath, final boolean isOdd) {
      super(remaining);
      mLimit = Z.ONE.shiftLeft(2 + ((long) WORD_SHIFT * (remaining + 1)));
      mRemaining = remaining;
      mMaxRoads = maxRoads;
      mIsPath = isPath;
      mSign = isOdd ? 0 : 1;
    }

    /**
     * Initial states to enumerate open meanders.
     * @return initial states
     */
    public Iterable<Pair<Integer, Z>> initialStates() {
      return Collections.singleton(new Pair<>(mIsPath ? -1 : 1,
        mRemaining % 2 == 0
          ? pack((Z.ONE.shiftLeft(WORD_SHIFT)).or(Z.ONE), (Z.ONE.shiftLeft(WORD_SHIFT)).or(Z.ONE))
          : pack(Z.ONE, ((Z.ONE.shiftLeft(WORD_SHIFT)).or(Z.ONE)).shiftLeft(WORD_SHIFT))));
    }


    public Iterable<Pair<Integer, Z>> enumerate(final Pair<Integer, Z> state) {
      final ArrayList<Pair<Integer, Z>> list = new ArrayList<>();
      for (Pair<Integer, Z> next : enumeratePossibilities(state.right(),
        (action, lower, upper) -> new Pair<>(state.left() < 0 && upper.isOne() ? -state.left() : state.left(), pack(lower, upper)))) {
        if (mLimit.signum() < 0 || next.right().compareTo(mLimit) < 0) {
          for (Pair<Integer, Z> s : fork(next)) {
            list.add(s);
          }
        }
      }
      return list;
    }

    private Iterable<Pair<Integer, Z>> fork(final Pair<Integer, Z> state) {
      final ArrayList<Pair<Integer, Z>> list = new ArrayList<>();
      // There is always the option to stay on the current road.
      list.add(state);

      // If we are not yet at the limit, also look into the possibility of moving to the next.
      if (state.left() < mMaxRoads && -state.left() < mMaxRoads) {
        final Z lower = extractLower(state.right());
        final Z upper = (state.right().subtract(lower)).divide2();
        final boolean canAdvance = (state.left() & 1) == mSign
          ? lower.isOne()
          : state.left() < 0 ? upper.equals(Z.ONE.shiftLeft(WORD_SHIFT).or(Z.ONE)) : upper.isOne();
        if (canAdvance) {
          list.add(new Pair<>(state.left() + (state.left() < 0 ? -1 : 1), state.right()));
        }
      }
      return list;
    }

    @Override
    protected Action closingAction(final Z lower, final Z upper) {
      return super.closingAction(lower, upper) == Action.JOIN_ARCH ? Action.JOIN_ARCH : Action.NONE;
    }
  }

  @Override
  public Z next() {
    ++mN;
    final SimpleProcessor<Pair<Integer, Z>> processor = new SimpleProcessor<>();
    final boolean odd = (mN & 1) == 1;
    processor.setCreateStateMachine(k -> new ParallelRoadsMeanderProblem(k, 2, odd, odd));
    return processor.process(mN, new ParallelRoadsMeanderProblem(mN, 2, odd, odd).initialStates());
  }
}
