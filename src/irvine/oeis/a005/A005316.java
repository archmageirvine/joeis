package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A005316 Meandric numbers: number of ways a river can cross a road n times.
 * @author Andrew Howroyd
 * @author Sean A. Irvine (Java port)
 */
public class A005316 implements Sequence {

  // Java implementation based on a C# implementation by Andrew Howroyd.
  // https://oeis.org/A005316/a005316.cs.txt
  // Original documentation for C# version follows.
  // Note some of the functionality discussed is not present in this Java version.

  /* Author: Andrew Howroyd. (c) 2015
     Terms of use: You may freely use this software for personal, open source, educational or commercial use.
     However, you may not redistribute or use this software in conjunction with any modification or improvement for which use is
     not fully granted to all under the terms of this or GPL/LGPL license. (to use freely you must be willing to give freely)
     You may release this code under the GNU Lesser Public License (LGPL v2.1: http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html)
     If you modify, adapt or reformat this code, please state clearly that the code has been modified from the original.
     No warranty.
   */

    /*
        This software is not a complete program. It is left to the end user to provide application code, api and top level enumeration functions.
        It is more intended as a starter tool-kit for those wanting to explore meanders or reproduce some of the known results.
        The code was compiled using Visual Studio Community 2015 and was run on the Windows platform using .Net 4.5.
        For BigInteger, the System.Numerics package must be added as a reference to the project. This is part of the standard .Net library.

        The basic meander transfer enumeration method is implemented in the MeanderProblem class. Sub classes of this provide
        customizations for different sequences. Included here are BasicMeanderProblem, MeandersByComponents and ParallelRoadsMeanderProblem.
        The first two enumerate the most important core sequences, whilst the ParallelRoadsMeanderProblem is a demonstration
        of how the same algorithm can be extended to a more complex problem - by pretending the multiple roads are a single
        snake like road and adding book keeping to track the meander from one bend to the next.
        The algorithm has also been successfully used to enumerate a variety of other meander sequences. (A060148, A077056, A060972, A259974).
        Code for these is not included here as it would add unnecessary clutter with little additional insight.

        In addition to a sub-class of BasicMeanderProblem a state machine processor is required. Two are included here.
        SimpleProcessor is the most natural and simple implementation, but will eventually fail at about 40 bridges due to
        insufficient memory to contain the entire state space. This is suitable for many needs.
        DivideAndConquerProcessor is a processor that reduces memory use at the cost of additional CPU by sub-dividing
        the problem into multiple partitions which are processed independently.

        The method is generally applicable to any meander problem that can be reduced to a simple left to right scan of the meander.
        More generally the 'transfer-matrix' method is applicable to a very wide class of enumeration problem.

        Sample usage:
        
        public Z OpenMeanderCount( int length)
        {
            int nn = length - 1;
            var processor = new SimpleProcessor<Z>() { CreateStateMachine = k => new BasicMeanderProblem( k) };
            return processor.Process(nn, new BasicMeanderProblem(nn).OpenMeanderInitialStates);
        }

        ArchConfiguration which is un-related and independent of the other classes is a set of utilities for working
        with arch configuration and menander permutations.   
        
     */

  /**
   * Base class for meander enumeration problems.
   *
   * Algorithm:
   * Based on: I. Jensen,
   * <a href="http://arXiv.org/abs/cond-mat/0008178">A transfer matrix approach to the enumeration of plane meanders</a>,
   * J. Phys. A 33 (2000), no. 34, 5953-5963.
   *
   * There are a few minor implementation differences.
   *   - Two separate bit sequences are used for the lower and upper segments, with the least significant bits closest to the road.
   *     These are inter-woven into a single integer valued state.
   *   - Bit value 1 is used to indicate that an arch originates on this side of the road and 0 indicates on the other side. This gives better symmetry when processing.
   *   - This algorithm does not have any notion of a free end - there is always a loop. Open meanders can be enumerated with an alternative initial state.
   *
   * Performance:
   * The primary limiting factor of the algorithm as presented here is memory rather than CPU. Approximately 2 GB is required to get to about 40 bridges.
   * However, by adopting a multi-stage process it is possible to some extent to trade memory usage for additional CPU.
   * The algorithm as presented here uses Z for both states and counts. For better CPU performance,  64-bit long integers can be used
   * at least for the open meander problem up to about 60 bridges before overflow will be an issue.
   */
  protected static final int WORD_SHIFT = 2;
  //protected static final int WORD_MASK = (1 << WORD_SHIFT) - 1;
  private static final Z ODD_BITS = Z.valueOf(0x5555555555555555L);

  /**
   * Combines the states for the lower and upper halves into a single integer.
   * Each half only uses even numbered bits, so they can be interleaved with a simple bit shift.
   * @param lower lower half
   * @param upper upper half
   * @return packed value
   */
  protected static Z pack(final Z lower, final Z upper) {
    if (lower.isZero() || upper.isZero()) {
      throw new IllegalStateException("invalid state");
    }
    return lower.or(upper.multiply2());
  }

  /*
   * The initial state of the traversal.
   */
  protected static final Z DEFAULT_INITIAL_STATE = pack(Z.ONE, Z.ONE);

  protected interface Func<S, R> {
    R f(S x);
  }

  protected interface Func2<A, B, R> {
    R f(A x, B y);
  }

  protected interface Func3<A, B, C, R> {
    R f(A x, B y, C z);
  }

  protected enum Action {
    NONE, NEW_ARCH, JOIN_ARCH, MOVE_UP, MOVE_DOWN, CLOSE_LOOP
  }

  protected abstract static class MeanderProblem {
    protected final int mLayerIndex;

    /**
     * Constructor.
     * @param layerIndex layer index
     */
    protected MeanderProblem(final int layerIndex) {
      mLayerIndex = layerIndex;
    }

    /**
     * Index of the transition layer. Useful for diagnostics/progress reporting.
     * @return the layer index
     */
    public int getLayerIndex() {
      return mLayerIndex;
    }

    /*
     * Enumerate next states from previous state.
     */
    protected <T> ArrayList<T> enumeratePossibilities(final Z state, final Func3<Action, Z, Z, T> capture) {
      // split the incoming state into lower and upper halves for ease of processing.
      final Z lower = extractLower(state);
      final Z upper = state.subtract(lower).divide2();

      final ArrayList<T> list = new ArrayList<>();

      // There are four possible state transitions.
      // 1. Leg of arch crosses from below road to above road. Allowed if not at edge guard.
      if (!lower.equals(Z.ONE)) {
        list.add(capture.f(Action.MOVE_UP, lower.shiftRight(WORD_SHIFT), (upper.shiftLeft(WORD_SHIFT)).xor(crossRoad(lower))));
      }
      // 2. Leg of arch crosses from above road to below road. Allowed if not at edge guard.
      if (!upper.equals(Z.ONE)) {
        list.add(capture.f(Action.MOVE_DOWN, (lower.shiftLeft(WORD_SHIFT)).xor(crossRoad(upper)), upper.shiftRight(WORD_SHIFT)));
      }
      // 3. Introduction of new arch. Allowed always.
      list.add(capture.f(Action.NEW_ARCH, (lower.shiftLeft(WORD_SHIFT)).or(Z.ONE), (upper.shiftLeft(WORD_SHIFT)).or(Z.ONE)));

      // 4. Arch connection. Possible if not at edge guard on either side.
      if (!lower.equals(Z.ONE) && !upper.equals(Z.ONE)) {
        final Action test = closingAction(lower, upper);
        if (test != Action.NONE) {
          list.add(capture.f(test, joinArch(lower, upper).shiftRight(WORD_SHIFT), joinArch(upper, lower).shiftRight(WORD_SHIFT)));
        }
      }
      return list;
    }

    protected Action closingAction(final Z lower, final Z upper) {
      return lower.isEven() || upper.isEven() ? Action.JOIN_ARCH : Action.CLOSE_LOOP;
    }

    /*
     * When crossing the road, we need to invert the bit that indicates if the arch originated on this side of the road.
     */
    protected Z crossRoad(final Z v) {
      return v.isEven() ? Z.ONE : Z.ZERO;
    }

    /*
     * Handles the mechanics of re-joining arches.
     */
    private Z joinArch(Z v, final Z alt) {
      // see Iwan Jenson paper to understand what is going on here. (with illustrations)
      if (v.isEven() && !alt.isEven()) {
        int n = 0;
        Z bit = Z.ONE;
        while (n >= 0) {
          bit = bit.shiftLeft(WORD_SHIFT);
          n += v.and(bit).isZero() ? 1 : -1;
        }
        v = v.xor(bit);
      }
      return v;
    }

    /**
     * Test for enclosure. Used to identify forest meander systems. (A060148)
     * @param v upper or lower half (doesn't matter which)
     * @return true if enclosed
     */
    protected boolean isEnclosed(final Z v) {
      boolean enclosed = true;
      for (Z bit = Z.TWO; bit.compareTo(v) <= 0; bit = bit.shiftLeft(WORD_SHIFT)) {
        enclosed = !enclosed;
      }
      return enclosed;
    }

    /**
     * Variation on pack that may swap lower and upper words. This reduces the total
     * number of states by about half, but is not safe in those cases where the distinction
     * between upper and lower is important. (This is purely a questionable optimization
     * that in a few cases allows an extra term to be computed)
     * @param lower lower half
     * @param upper upper half
     * @return packed value
     */
    protected Z packSymmetrical(final Z lower, final Z upper) {
      return lower.compareTo(upper) < 0 ? (upper.or(lower.multiply2())) : (lower.or(upper.multiply2()));
    }

    /**
     * Extracts the lower arch configuration from an encoding.
     * The upper arch configuration can the be obtained by subtraction.
     * This undoes the encoding of pack.
     * @param v encoding
     * @return lower arch
     */
    protected Z extractLower(final Z v) {
      Z mask = ODD_BITS;
      int bits = 64;
      while (mask.compareTo(v) < 0) {
        mask = mask.or(mask.shiftLeft(bits));
        bits += bits;
      }
      return v.and(mask);
    }
  }

  /**
   * Interface to abstract state enumeration process.
   * @param <T> type of state
   */
  protected interface StateMachine<T> {

    int getLayerIndex();

    Iterable<T> enumerate(final T state);
  }

  /**
   * Processing component to determine number of open meanders. (A005316).
   */
  protected static class BasicMeanderProblem extends MeanderProblem implements StateMachine<Z> {
    private final Z mLimit;
    private final boolean mIsOdd;

    public BasicMeanderProblem(final int remainingBridges) {
      super(remainingBridges);
      mLimit = Z.ONE.shiftLeft(2 + (WORD_SHIFT * (remainingBridges + 1)));
      mIsOdd = (remainingBridges & 1) == 1;
    }

    /**
     * Initial states to enumerate open meanders.
     * @return initial states
     */
    public Iterable<Z> openMeanderInitialStates() {
      return Collections.singleton(mIsOdd ? pack(Z.ONE.shiftLeft(WORD_SHIFT).or(Z.ONE).shiftLeft(WORD_SHIFT), Z.ONE) : pack(Z.ONE.shiftLeft(WORD_SHIFT).or(Z.ONE), Z.ONE.shiftLeft(WORD_SHIFT).or(Z.ONE)));
    }

    /**
     * Initial states used to enumerate semi-meanders. (A000682)
     * @return meanders
     *
     */
    public Iterable<Z> semiMeanderInitialStates() {
      final ArrayList<Z> res = new ArrayList<>();
      Z bits = mIsOdd ? Z.ONE : Z.ONE.shiftLeft(WORD_SHIFT).or(Z.ONE);
      Z state = pack(bits, bits);
      while (state.compareTo(mLimit) < 0) {
        res.add(state);
        bits = bits.shiftLeft(WORD_SHIFT).or(Z.ONE).shiftLeft(WORD_SHIFT).or(Z.ONE);
        state = pack(bits, bits);
      }
      return res;
    }

//    /**
//     * Initial states for rotationally symmetric loops on two parallel roads. (part of A086031)
//     * gives 1,3,16,105,786,6398,55280,499293,4667290,44840730
//     */
//    public Iterator<Z> ParallelRoadSymmetricMeanderInitialStates
//    {
//      get
//      {
//        Z bits = (1 << WORD_SHIFT) | 1;
//        var state = Pack(bits << WORD_SHIFT, Z.ONE);
//        int r = 1;
//        while (state < m_Limit) {
//          yield return state;
//          r += 2;
//          bits = (((bits << WORD_SHIFT) | Z.ONE) << WORD_SHIFT) | Z.ONE;
//          state = Pack(bits << (WORD_SHIFT * r), Z.ONE);
//        }
//      }
//    }

    /**
     * Enumerate next states from previous state.
     */
    public Iterable<Z> enumerate(final Z state) {
      final ArrayList<Z> list = new ArrayList<>();
      for (final Z next : enumeratePossibilities(state, (action, lower, upper) -> pack(lower, upper))) {
        if (mLimit.signum() < 0 || next.compareTo(mLimit) < 0) {
          list.add(next);
        }
      }
      return list;
    }

    @Override
    protected Action closingAction(final Z lower, final Z upper) {
      return super.closingAction(lower, upper) == Action.JOIN_ARCH ? Action.JOIN_ARCH : Action.NONE;
    }
  }


//    /**
//     * Processing component for meanders with multiple parallel roads. (A076876, A206432, A204352 etc). Can also handle loops on multiple parallel roads (A086031).
//     */
//    class ParallelRoadsMeanderProblem : MeanderProblem, IStateMachine<Pair<int, Z>>
//    {
//        private final Z m_Limit;
//        private final int m_MaxRoads;
//        private final boolean m_IsPath;
//        private final int m_Remaining;
//        private final int m_Sign;
//
//        public ParallelRoadsMeanderProblem( int remaining, int maxRoads, boolean isPath, boolean isOdd) : base( remaining)
//        {
//            m_Limit = Z.ONE << (2 + (WORD_SHIFT * (remaining + 1)));
//            m_Remaining = remaining;
//            m_MaxRoads = maxRoads;
//            m_IsPath = isPath;
//            m_Sign = isOdd ? 0 : 1;
//        }
//
//        public Pair<int, Z> InitialState
//        {
//            get
//            {
//                return Pair.Create( m_IsPath ? -1 : 1,
//              m_Remaining % 2 == 0 ? Pack( (Z.ONE << WORD_SHIFT) | Z.ONE, (Z.ONE << WORD_SHIFT) | Z.ONE)
//              : Pack( Z.ONE, ((Z.ONE << WORD_SHIFT) | Z.ONE) << WORD_SHIFT));
//            }
//        }
//
//        public Iterator<Pair<int, Z>> Enumerate( Pair<int, Z> state)
//        {
//            return EnumeratePossibilities( state.Item2,
//                    ( action, lower, upper) => Pair.Create( state.Item1 < 0 && upper.equals(Z.ONE) ? -state.Item1 : state.Item1, Pack( lower, upper)))
//                .Where( next => m_Limit.Sign < 0 || next.Item2 < m_Limit)
//                .SelectMany( Fork);
//        }
//
//        private Iterator<Pair<int, Z>> Fork( Pair<int, Z> state)
//        {
//            // There is always the option to stay on the current road.
//            yield return state;
//
//            // If we are not yet at the limit, also look into the possibility of moving to the next.
//            if (state.Item1 < m_MaxRoads && -state.Item1 < m_MaxRoads)
//            {
//                var lower = ExtractLower( state.Item2);
//                var upper = (state.Item2 - lower) >> 1;
//                boolean canAdvance = (state.Item1 & 1) == m_Sign ? lower.equals(Z.ONE)
//                                : state.Item1 < 0 ? upper == ((1 << WORD_SHIFT) | 1) : upper.equals(Z.ONE);
//                if (canAdvance)
//                {
//                    yield return Pair.Create( state.Item1 + (state.Item1 < 0 ? -1 : 1), state.Item2);
//                }
//            }
//        }
//
//        protected override Action ClosingAction( Z lower, Z upper)
//        {
//            return base.ClosingAction( lower, upper) == Action.JoinArch ? Action.JoinArch : Action.None;
//        }
//    }

  /**
   * Simple processing engine that will work with any kind of state type.
   * @param <S> state type
   */
  public static class SimpleProcessor<S> {
    private long mTotalTransitions;
    
    long getTotalTransitions() {
      return mTotalTransitions;
    }
    
    void setTotalTransitions(final long totalTransitions) {
      mTotalTransitions = totalTransitions;
    }

    Func<Integer, StateMachine<S>> mCreateStateMachine;

    /**
     * Set state creation machine.
     * @param createStateMachine state creator
     */
    public void setCreateStateMachine(final Func<Integer, StateMachine<S>> createStateMachine) {
      mCreateStateMachine = createStateMachine;
    }

    Func<Integer, StateMachine<S>> getCreateStateMachine() {
      return mCreateStateMachine;
    }

    /**
     * Main function. Processes initial states down to final count.
     * @param bridges number of bridges
     * @param initialStates initial states
     * @return count
     */
    public Z process(final int bridges, final Iterable<S> initialStates) {
      List<Pair<S, Z>> counts = new ArrayList<>();
      for (final S state : initialStates) {
        counts.add(new Pair<>(state, Z.ONE));
      }
      int nn = bridges;
      while (nn > 0) {
        counts = accumulate(getCreateStateMachine().f(--nn), counts);
      }
      return total(counts);
    }

    /*
     * Determines the final total value.
     */
    protected Z total(final Iterable<Pair<S, Z>> counts) {
      Z total = Z.ZERO;
      for (final Pair<S, Z> kv : counts) {
        total = total.add(kv.right());
      }
      return total;
    }

    /*
     * Processes one layer.
     */
    protected List<Pair<S, Z>> accumulate(final StateMachine<S> layer, final List<Pair<S, Z>> previous) {
      final HashMap<S, Z> counts = new HashMap<>();
      long transitions = 0;
      for (final Pair<S, Z> kv : previous) {
        for (final S state : layer.enumerate(kv.left())) {
          final Z n = counts.get(state);
          counts.put(state, n != null ? n.add(kv.right()) : kv.right());
          ++transitions;
        }
      }
      mTotalTransitions += transitions;
      final ArrayList<Pair<S, Z>> res = new ArrayList<>();
      for (final Map.Entry<S, Z> e : counts.entrySet()) {
        res.add(new Pair<>(e.getKey(), e.getValue()));
      }
      return res;
    }
  }

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    final SimpleProcessor<Z> processor = new SimpleProcessor<>();
    processor.setCreateStateMachine(BasicMeanderProblem::new);
    return processor.process(mN, new BasicMeanderProblem(mN).openMeanderInitialStates());
  }
}
