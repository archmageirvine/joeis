package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A005316.
 * @author Andrew Howroyd
 * @author Sean A. Irvine (Java port)
 */
public class A005316 implements Sequence {

  // Java implementation based on a C# implementation by Andrew Howroyd.
  // https://oeis.org/A005316/a005316.cs.txt
  // Original documentation for C# version follows.
  // Note some of the functionality discussed is not present in this Java version

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
        DivideAndConquerProcessor is a processor that reduces memory use at the cost of additional cpu by sub-dividing
        the problem into multiple partitions which are processed independently.

        The method is generally applicable to any meander problem that can be reduced to a simple left to right scan of the meander.
        More generally the 'transfer-matrix' method is applicable to a very wide class of enumeration problem.

        Sample usage:
        
        public Z OpenMeanderCount( int length )
        {
            int nn = length - 1;
            var processor = new SimpleProcessor<Z>() { CreateStateMachine = k => new BasicMeanderProblem( k ) };
            return processor.Process( nn, new BasicMeanderProblem( nn ).OpenMeanderInitialStates );
        }

        ArchConfiguration which is un-related and independent of the other classes is a set of utilities for working
        with arch configuration and menander permutations.   
        
     */

  /**
   * Base class for meander enumeration problems.
   *
   * Algorithm:
   * Based on: I. Jensen, A transfer matrix approach to the enumeration of plane meanders, J. Phys. A 33 (2000), no. 34, 5953-5963.
   * http://arXiv.org/abs/cond-mat/0008178
   * There are a few minor implementation differences.
   *   - Two separate bit sequences are used for the lower and upper segments, with the least significant bits closest to the road.
   *     These are inter-woven into a single integer valued state.
   *   - Bit value 1 is used to indicate that an arch originates on this side of the road and 0 indicates on the other side. This gives better symmetry when processing.
   *   - This algorithm does not have any notion of a free end - there is always a loop. Open meanders can be enumerated with an alternative initial state.
   *
   * Performance:
   * The primary limiting factor of the algorithm as presented here is memory rather than cpu. Approximately 2GB is required to get to about 40 bridges.
   * However, by adopting a multi-stage process it is possible to some extent to trade memory usage for additional cpu.
   * The algorithm as presented here uses Z for both states and counts. For better cpu performance,  64-bit long integers can be used
   * at least for the open meander problem up to about 60 bridges before overflow will be an issue.
   */
  protected static int WORD_SHIFT = 2;
  protected static int WORD_MASK = (1 << WORD_SHIFT) - 1;

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

  protected abstract class MeanderProblem {
    protected final int mLayerIndex;

    /**
     * Constructor.
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
        Action test = closingAction(lower, upper);
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
          n += Z.ZERO.equals(v.and(bit)) ? 1 : -1;
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
     * Combines the states for the lower and upper halves into a single integer.
     * Each half only uses even numbered bits, so they can be interleaved with a simple bit shift.
     * @param lower lower half
     * @param upper upper half
     */
    protected Z pack(final Z lower, final Z upper) {
      if (lower.equals(Z.ZERO) || upper.equals(Z.ZERO)) {
        throw new IllegalStateException("invalid state");
      }
      return lower.or(upper.multiply2());
    }

    /**
     * Variation on pack that may swap lower and upper words. This reduces the total
     * number of states by about half, but is not safe in those cases where the distinction
     * between upper and lower is important. (This is purely a questionable optimisation
     * that in a few cases allows an extra term to be computed)
     * @param lower lower half
     * @param upper upper half
     */
    protected Z packSymmetrical(final Z lower, final Z upper) {
      return lower.compareTo(upper) < 0 ? (upper.or(lower.multiply2())) : (lower.or(upper.multiply2()));
    }

    /**
     * Extracts the lower arch configuration from an encoding.
     * The upper arch configuration can the be obtained by subtraction.
     * This undoes the encoding of Pack.
     */
    protected Z extractLower(Z v) {
      Z mask = Z.valueOf(0x5555555555555555L);
      int bits = 64;
      while (mask.compareTo(v) < 0) {
        mask = mask.or(mask.shiftLeft(bits));
        bits += bits;
      }
      return v.and(mask);
    }


    /*
     * The initial state of the traversal.
     */
    protected Z mDefaultInitialState = pack(Z.ONE, Z.ONE);


//    /**
//     * Provides a heuristic to group states into partitions. Used by the DivideAndConquerProcessor.
//     * The aim is to put similar states into the same partition, but there is no guarantee that this achieves that goal.
//     */
//    public static int Cluster(Z state, int level) {
//      Func<Z, Z> Reduce = v =>
//      {
//        var limit = Z.ONE.shiftLeft(2 + (WORD_SHIFT * level));
//        if (v < limit) {
//          return Z.ONE;
//        }
//        while (v >= limit) {
//          v >>= WORD_SHIFT;
//        }
//        return v;
//      }
//      ;
//      var lower = ExtractLower(state);
//      var upper = (state - lower) >> 1;
//      return (int) Pack(Reduce(lower), Reduce(upper));
//    }

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
  class BasicMeanderProblem extends MeanderProblem implements StateMachine<Z> {
    private final Z mLimit;
    private final boolean mIsOdd;

    public BasicMeanderProblem(final int remainingBridges) {
      super(remainingBridges);
      mLimit = Z.ONE.shiftLeft(2 + (WORD_SHIFT * (remainingBridges + 1)));
      mIsOdd = (remainingBridges & 1) == 1;
    }

    /**
     * Initial states to enumerate open meanders.
     */
    public Iterable<Z> openMeanderInitialStates() {
      return () -> new Iterator<Z>() {
        boolean mFirst = true;

        @Override
        public boolean hasNext() {
          if (mFirst) {
            mFirst = false;
            return true;
          }
          return false;
        }

        @Override
        public Z next() {
          return mIsOdd ? pack(((Z.ONE.shiftLeft(WORD_SHIFT)).or(Z.ONE).shiftLeft(WORD_SHIFT)), Z.ONE) : pack((Z.ONE.shiftLeft(WORD_SHIFT)).or(Z.ONE), (Z.ONE.shiftLeft(WORD_SHIFT)).or(Z.ONE));
        }
      };
    }

//    /**
//     * Initial states used to enumerate semi-meanders. (A000682)
//     */
//    public Iterator<Z> SemiMeanderInitialStates
//    {
//      get
//      {
//        Z bits = m_IsOdd ? 1 : (1 << WORD_SHIFT) | 1;
//        var state = Pack(bits, bits);
//        while (state < m_Limit) {
//          yield return state;
//          bits = (((bits << WORD_SHIFT) | Z.ONE) << WORD_SHIFT) | Z.ONE;
//          state = Pack(bits, bits);
//        }
//      }
//    }
//
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
      for (final Z next : enumeratePossibilities(state, (action, lower, upper) -> pack(lower, upper) )) {
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
//        public ParallelRoadsMeanderProblem( int remaining, int maxRoads, boolean isPath, boolean isOdd ) : base( remaining )
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
//              m_Remaining % 2 == 0 ? Pack( (Z.ONE << WORD_SHIFT) | Z.ONE, (Z.ONE << WORD_SHIFT) | Z.ONE )
//              : Pack( Z.ONE, ((Z.ONE << WORD_SHIFT) | Z.ONE) << WORD_SHIFT ) );
//            }
//        }
//
//        public Iterator<Pair<int, Z>> Enumerate( Pair<int, Z> state )
//        {
//            return EnumeratePossibilities( state.Item2,
//                    ( action, lower, upper ) => Pair.Create( state.Item1 < 0 && upper.equals(Z.ONE) ? -state.Item1 : state.Item1, Pack( lower, upper ) ) )
//                .Where( next => m_Limit.Sign < 0 || next.Item2 < m_Limit )
//                .SelectMany( Fork );
//        }
//
//        private Iterator<Pair<int, Z>> Fork( Pair<int, Z> state )
//        {
//            // There is always the option to stay on the current road.
//            yield return state;
//
//            // If we are not yet at the limit, also look into the possibility of moving to the next.
//            if (state.Item1 < m_MaxRoads && -state.Item1 < m_MaxRoads)
//            {
//                var lower = ExtractLower( state.Item2 );
//                var upper = (state.Item2 - lower) >> 1;
//                boolean canAdvance = (state.Item1 & 1) == m_Sign ? lower.equals(Z.ONE)
//                                : state.Item1 < 0 ? upper == ((1 << WORD_SHIFT) | 1) : upper.equals(Z.ONE);
//                if (canAdvance)
//                {
//                    yield return Pair.Create( state.Item1 + (state.Item1 < 0 ? -1 : 1), state.Item2 );
//                }
//            }
//        }
//
//        protected override Action ClosingAction( Z lower, Z upper )
//        {
//            return base.ClosingAction( lower, upper ) == Action.JoinArch ? Action.JoinArch : Action.None;
//        }
//    }

  /**
   * Simple processing engine that will work with any kind of state type.
   * @param <S> state type
   */
  public static class SimpleProcessor<S> {
    public long mTotalTransitions;
    
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
        counts = accumulate(mCreateStateMachine.f(--nn), counts);
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

//    #region DivideAndConquerProcessor
//    /**
//     * Enhanced processor that will partition the work into buckets as required in order to reduce memory load. Works only with basic Z state.
//     */
//     * <remarks>
//     * Optimal choice of split limit and repartition bucket size is dependent on the number of bridges to be processed as well as memory constraints.
//     * Ideally we want to use as much memory as possible to reduce the number of times the data needs to be repartitioned.
//     * The author has not investigated best practice heuristics.
//     * For better performance we really want to work as much as possible with 64-bit unsigned ints.
//     * (Code for this is really a lot of ugly duplication so is not included here: C# generics does not readily accomodate this.)
//     * This method was successfully used to compute a003516(55) in about 24 hours on a single core, requiring the processing of nearly 400 billion state transitions.
//     * </remarks>
//    class DivideAndConquerProcessor : SimpleProcessor<Z>
//    {
//
//        public int SplitLimit
//        { get; set; }
//        public int RepartionBucketSize
//        { get; set; }
//
//        /**
//         * Constructor.
//         */
//        public DivideAndConquerProcessor()
//        {
//            SplitLimit = 1000000;
//            RepartionBucketSize = 150000;
//        }
//
//        /**
//         * Main function. Processes initial states down to final count. 
//         */
//        public override Z Process( int bridges, Iterator<Z> initialStates )
//        {
//            var counts = initialStates.Select( state => new Pair<Z, Z>( state, Z.ONE ) ).ToArray();
//            return ProcessCluster( new[] { counts }.ToList(), bridges );
//        }
//
//        /**
//         * Called recursively to process a partitioned work-load.
//         */
//        private Z ProcessCluster( List<Pair<Z, Z>[]> work, int remainingBridges )
//        {
//            LogProgress( "Begin Cluster at {0}; items={1}", remainingBridges, work.Count );
//
//            Z total = Z.ZERO;
//            for (int workIndex = 0; workIndex < work.Count; ++workIndex)
//            {
//                LogProgress( "Layer {0}: Processing List {1} of {2}, items={3}", remainingBridges, workIndex + 1, work.Count, work[ workIndex ].length );
//
//                var counts = work[ workIndex ];
//                work[ workIndex ] = null;
//
//                int b = remainingBridges;
//                while (b > 0 && counts.length < SplitLimit)
//                {
//                    counts = Accumulate( CreateStateMachine( --b ), counts );
//                }
//                if (b == 0)
//                {
//                    total += Total( counts );
//                }
//                else
//                {
//                    var partitions = BuildCluster( counts, RepartionBucketSize );
//                    GC.Collect();
//                    counts = null;
//                    total += ProcessCluster( partitions, b );
//                }
//            }
//            LogProgress( "End Cluster at {0}", remainingBridges );
//            return total;
//        }
//
//        /**
//         * Given a source list of state-value pairs, partitions the list into multiple buckets for separate processing.
//         * State-value pairs are represented by key-value pairs of Z meander states and NumberType.
//         */
//        private List<Pair<Z, NumberType>[]> BuildCluster<NumberType>( Iterator<Pair<Z, NumberType>> source, int maxSize )
//        {
//            var current = new List<List<Pair<Z, NumberType>>>();
//            var output = new List<Pair<Z, NumberType>[]>();
//            current.Add( source.ToList() );
//            for (int level = 4; current.Count > 0; ++level)
//            {
//                var stillToBig = new List<List<Pair<Z, NumberType>>>();
//                for (int currentIndex = 0; currentIndex < current.Count; ++currentIndex)
//                {
//                    var stateDictionary = current[ currentIndex ];
//                    current[ currentIndex ] = null;
//                    // divide each item in stateDictionary into a bucket based on MeanderState.Cluster.
//                    var index = new Dictionary<int, List<Pair<Z, NumberType>>>();
//                    foreach (var kv in stateDictionary)
//                    {
//                        var cluster = MeanderState.Cluster( kv.Key, level );
//                        List<Pair<Z, NumberType>> inner;
//                        if (!index.TryGetValue( cluster, out inner ))
//                        {
//                            inner = new List<Pair<Z, NumberType>>();
//                            index.Add( cluster, inner );
//                        }
//                        inner.Add( kv );
//                    }
//                    stateDictionary = null;
//                    // now sort through each list, putting onto either output list or stillToBig as appropriate.
//                    List<Pair<Z, NumberType>> small = null;
//                    foreach (var component in index.Values)
//                    {
//                        if (component.Count > maxSize)
//                        {
//                            stillToBig.Add( component );
//                        }
//                        else if (component.Count > maxSize / 2)
//                        {
//                            output.Add( component.ToArray() );
//                        }
//                        else if (small == null)
//                        {
//                            small = component;
//                        }
//                        else
//                        {
//                            small.AddRange( component );
//                            if (small.Count > maxSize / 2)
//                            {
//                                output.Add( small.ToArray() );
//                                small = null;
//                            }
//                        }
//                    }
//                    if (small != null)
//                    {
//                        output.Add( small.ToArray() );
//                        small = null;
//                    }
//                }
//                current = stillToBig;
//            }
//            return output;
//        }
//    }

  /**
   * Set of utility methods for exploring arch configurations and meanders.
   * These are mostly suitable for small n, but have the advantage that the actual meander is obtainable.
   *
   * Both arch configurations and meanders are permutations with a length that is even.
   * They are represented using integer arrays of their permutation in an obvious manner.
   * This class although self contained does not include general methods for working with permutations.
   */
  public static class ArchConfiguration {

    /**
     * The number of arch configurations. (Catalan numbers) (A000108)
     */
    public static int archConfigurationCount(int n) {
      int c = 0;
      for (final int[] a : enumerateArches(n, arch -> arch)) {
        ++c;
      }
      return c;
    }

    /**
     * The number of closed meanders. (A005315)
     */
    public static int closedMeanderCount(final int n) {
      int c = 0;
      for (final int cnt : enumerateArches(n, arch -> archMeanderCount(arch))) {
        c += cnt;
      }
      return c;
    }

//    /**
//     * The number of open meanders with an even number of bridges. (A077054)
//     */
//    public static int OpenMeanderCount(int n) {
//      return EnumerateArches(n, arch = > ExteriorArchCount(arch) * ArchMeanderCount(arch) ).Sum();
//    }
//
//    /**
//     * The number of symmetric closed meanders. (A060206)
//     */
//    public static int SymmetricClosedMeanderCount(int n) {
//      int nn = 4 * n - 2;
//      return EnumerateArches(nn / 2, arch = > arch )
//                    .Where(arch = > IsSymmetricArch(arch, k = > nn - k - 1 ) )
//                    .Count();
//    }
//
//    /**
//     * The number of symmetric open meanders. (A223096)
//     */
//    public static int SymmetricOpenMeanderCount(int n) {
//      int nn = 2 * n + 2;
//      return EnumerateArches(nn / 2, arch = > arch )
//                    .Where(arch = > IsSymmetricArch(arch, k = > k == 0 ? 0 : nn - k ) )
//                    .Count() / 2;
//    }

    /**
     * The number of arch configurations which have reflective symmetry. (gives A001405)
     */
    public static int reflectiveArchConfigurationCount(final int n) {
      int c = 0;
      for (final int[] arch1 : enumerateArches(n, arch -> arch )) {
        if (isReflectiveArch(arch1)) {
          ++c;
        }
      }
      return c;
    }

//    /**
//     * The number of isomorphic arch configurations, where equivalence is defined on rotation. (gives A002995)
//     */
//    public static int CyclicallyDistinctArchConfigurationCount(int n) {
//      return ArchConfiguratonsByCyclicOrder(n).Select(kv -> kv.Value ).Sum();
//    }

//    /**
//     * Groups arch configurations according to cyclic order.
//     */
//    public static TreeMap<Integer, Integer> ArchConfiguratonsByCyclicOrder(int n) {
//      var results = EnumerateArches(n, arch -> CyclicOrder(arch) ).GroupBy(k -> k ).ToDictionary(g -> g.Key, g -> g.Count() / g.Key );
//      return new TreeMap<>(results);
//    }

//    /**
//     * Groups arch configurations according to the number of meanders they form. (no obvious use for this break down).
//     */
//    public static TreeMap<Integer, Integer> ArchConfiguratonsByMeanders(int n) {
//      var results = EnumerateArches(n, arch -> ArchMeanderCount(arch) ) .GroupBy(k -> k ).ToDictionary(g -> g.Key, g ->g.Count() );
//      return new TreeMap<>(results);
//    }

    /**
     * Determines the number of meanders an arch can form.
     */
    public static int archMeanderCount(final int[] arch) {
      int c = 0;
      for (final int[] arch1 : enumerateArches(arch.length / 2, arch2 -> arch2)) {
        if (isMeander(arch, arch1)) {
          ++c;
        }
      }
      return c;
    }

    /**
     * Enumerates all closed meanders with 2n bridges.
     */
    public static <T> Iterator<T> enumerateClosedMeanders(final int n, final Func2<int[],int[],T> capture) {
      final ArrayList<T> q = new ArrayList<>();
      for (final int[] arch1 : enumerateArches(n, arch1 -> arch1)) {
        for (final int[] arch2 : enumerateArches(n, arch2 -> arch2)) {
          if (isMeander(arch1, arch2)) {
            q.add(capture.f(arch1, arch2));
          }
        }
      }
      return q.iterator();
    }

    /**
     * Tests if two arch configurations come together to make a meander.
     */
    public static boolean isMeander(final int[] arch1, final int[] arch2) {
      int n = arch1.length;
      int p = 0;
      for (int i = 0; i < n; i += 2) {
        if (p == 0 && i > 0) {
          return false;
        }
        p = arch2[arch1[p]];
      }
      if (p != 0) {
        throw new IllegalStateException("internal error");
      }
      return true;
    }

    /**
     * Converts lower and upper arch configurations into a meander permutation. Also works with meander systems.
     */
    public static int[] archesToMeander(final int[] arch1, final int[] arch2) {
      int n = arch1.length;
      int[] meander = new int[n];
      for (int i = 0; i < n; i += 2) {
        meander[i] = arch1[i];
        meander[i + 1] = arch2[i + 1];
      }
      return meander;
    }

    /**
     * Converts a meander into a pair of arches. This is the converse of ArchesToMeander.
     */
    public static Pair<int[], int[]> meanderToArches(final int[] meander) {
      int n = meander.length;
      int[] arch1 = new int[n];
      int[] arch2 = new int[n];
      for (int i = 0; i < n; i += 2) {
        int q = meander[i];
        arch1[i] = q;
        arch1[q] = i;
        int j = i + 1;
        q = meander[j];
        arch2[j] = q;
        arch2[q] = j;
      }

      return new Pair<>(arch1, arch2);
    }

    /**
     * Returns the number of exterior arches in an arch configuration.
     */
    public static int exteriorArchCount(final int[] arch) {
      int count = 0;
      for (int p = 0; p < arch.length; p = arch[p] + 1) {
        ++count;
      }
      return count;
    }

    /**
     * Tests if an arch configuration can be combined with it-self to make a meander.
     */
    public static boolean isSymmetricArch(int[] arch, Func<Integer, Integer> reflection) {
      int n = arch.length;
      int p = 0;
      for (int i = 0; i < n; i += 2) {
        if (p == 0 && i > 0) {
          return false;
        }
        p = arch[p];
        p = reflection.f(arch[reflection.f(p)]);
      }
      if (p != 0) {
        throw new IllegalStateException("internal error");
      }
      return true;
    }

    /**
     * Tests if an arch configuration when reflected gives it-self.
     */
    public static boolean isReflectiveArch(int[] arch) {
      int nm1 = arch.length - 1;
      for (int k = 0; k < arch.length; ++k) {
        if (nm1 - arch[k] != arch[nm1 - k]) {
          return false;
        }
      }
      return true;
    }

    /**
     * Determines the minimum amount of rotation required to bring an arch configuration back to it-self.
     */
    public static int cyclicOrder(int[] arch) {
      for (int i = 1; i < arch.length; ++i) {
        if (cyclicSelfCompare(arch, i) == 0) {
          return i;
        }
      }
      return arch.length;
    }


    /**
     * Compares an arch configuration with a cyclic shift of itself.
     */
    public static int cyclicSelfCompare(int[] arch, int shift) {
      int d = 0;
      for (int i = 0; d == 0 && i < arch.length; ++i) {
        final int ai = arch[i];
        d = Integer.compare(arch[(i >= shift ? i : arch.length + i) - shift], ((ai >= shift ? ai : arch.length + ai) - shift));
      }
      return d;
    }

    /**
     * Tests if an array of values represents a valid arch configuration permutation.
     */
    public static boolean isArchConfiguration(int[] arch) {
      for (int i = 0; i < arch.length; ++i) {
        int t = arch[i];
        if (t < 0 || t >= arch.length || t == i || arch[t] != i) {
          return false;
        }
      }
      return true;
    }

    /**
     * Enumerates all arch configurations with 2n points.
     * This method non-recursively enumerates permutations which are arch configurations. (Count gives Catalan numbers)
     * Use this in preference to low level InitialArchConfiguration / NextArchConfiguration methods.
     */
    public static <T> Iterable<T> enumerateArches(int n, Func<int[],T> capture ) {
      return () -> new Iterator<T>() {
        int[] perm = initialArchConfiguration(n);

        @Override
        public boolean hasNext() {
          return nextArchConfiguration(perm);
        }

        @Override
        public T next() {
          return capture.f(perm);
        }
      };
    }

    /**
     * Gets an initial arch configuration permutation that can be used with NextArchConfiguration to get the full sequence.
     */
    public static int[] initialArchConfiguration(final int n) {
      final int[] perm = new int[2 * n];
      for (int i = 0; i < perm.length; ++i) {
        perm[i] = perm.length - 1 - i;
      }
      return perm;
    }

    /**
     * Given an arch configuration, updates it to the 'next' one. No state is required to perform this update.
     * Note that this performs a destructive update for efficiency.
     * Arch configurations are ordered with the deepest possible nesting first. '((()))' -> '(()())' ... -> '()()()'.
     */
    public static boolean nextArchConfiguration(final int[] perm) {
      int pushed = 0;
      int stack = -1;
      int idx = perm.length;
      boolean backtracking = true;
      while (backtracking && idx != 0) {
        --idx;
        if (idx == stack) {
          stack = perm[idx];
          --pushed;
          backtracking = pushed == 0;
        } else {
          perm[perm[idx]] = stack;
          stack = perm[idx];
          ++pushed;
        }
      }
      if (pushed > 0) {
        perm[idx] = stack;
        stack = perm[stack];
        perm[perm[idx]] = idx;
        --pushed;
        ++idx;
      }

      do {
        if (idx < perm.length - pushed) {
          perm[idx] = stack;
          stack = idx;
          ++pushed;
        } else {
          perm[idx] = stack;
          stack = perm[stack];
          perm[perm[idx]] = idx;
          --pushed;
        }
      } while (++idx < perm.length);

      return !backtracking;
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
