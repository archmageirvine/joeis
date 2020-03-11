package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.Collections;

import irvine.math.z.Z;
import irvine.oeis.a005.A005316;
import irvine.util.Pair;

/**
 * A006657 Closed meanders with 2 components and <code>2n</code> bridges.
 * @author Andrew Howroyd
 * @author Sean A. Irvine (Java port)
 */
public class A006657 extends A005316 {

  /**
   * Processing component to count meander systems or semi-meander systems by number of component.
   * A006657, A006658, A008828, A046721, A046726
   */
  protected static class MeandersByComponents extends MeanderProblem implements StateMachine<Pair<Integer, Z>> {
    private final Z mLimit;
    private final Integer mMaxComponents;
    //private final int mRemainingBridges;

    MeandersByComponents(final int remainingBridges, final Integer maxComponents) {
      super(remainingBridges);
      //mRemainingBridges = remainingBridges;
      mLimit = Z.ONE.shiftLeft(2 + (WORD_SHIFT * remainingBridges));
      mMaxComponents = remainingBridges == 0 || maxComponents == null ? null : maxComponents - 1;
    }

    /**
     * Initial states for closed meander systems.
     */
    public Iterable<Pair<Integer, Z>> closedMeanderInitialStates() {
      return Collections.singleton(new Pair<>(0, mDefaultInitialState));
    }

//        /**
//         * Initial states for semi-meander systems.
//         */
//        public Iterator<Pair<Integer, Z>> SemiMeanderInitialStates( Func<Integer, Boolean> windingPredicate )      {
//            Z bits = Z.ONE;
//            var state = pack( bits, bits );
//            int winding = 0;
//            while (state < m_Limit)
//            {
//                if ((winding & 1) == (m_RemainingBridges & 1) && (windingPredicate == null || windingPredicate( winding )))
//                {
//                    yield return Pair.Create( 0, state );
//                }
//                ++winding;
//                bits = (bits << WORD_SHIFT) | Z.ONE;
//                state = pack( bits, bits );
//            }
//        }

    public Iterable<Pair<Integer, Z>> enumerate(final Pair<Integer, Z> state) {
      final int n = state.left();
      final ArrayList<Pair<Integer, Z>> res = new ArrayList<>();
      for (final Pair<Integer, Z> next : enumeratePossibilities(state.right(), (action, lower, upper) -> new Pair<>(action == Action.CLOSE_LOOP ? n + 1 : n, packSymmetrical(lower, upper)))) {
        if ((mLimit.signum() < 0 || next.right().compareTo(mLimit) < 0) && (mMaxComponents == null || state.left() <= mMaxComponents)) {
          res.add(next);
        }
      }
      return res;
    }
  }

  private int mN = components() * 2 - 2;

  protected int components() {
    return 2;
  }

  @Override
  public Z next() {
    mN += 2;
    final SimpleProcessor<Pair<Integer, Z>> processor = new SimpleProcessor<Pair<Integer, Z>>() {
      @Override
      protected Z total(final Iterable<Pair<Pair<Integer, Z>, Z>> counts) {
        Z count = Z.ZERO;
        for (final Pair<Pair<Integer, Z>, Z> e : counts) {
          if (e.left().left() == components()) {
            count = count.add(e.right());
          }
        }
        return count;
      }
    };
    processor.setCreateStateMachine(k -> new MeandersByComponents(k, components()));
    return processor.process(mN, new MeandersByComponents(mN, components()).closedMeanderInitialStates());
  }
}
