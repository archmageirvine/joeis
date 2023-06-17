package irvine.oeis.a343;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Permutation;

/**
 * A343146 Number of move sequences of length 2n on the "8 Puzzle" which leave the final state unchanged when the empty cell starts in a corner.
 * @author Sean A. Irvine
 */
public class A343146 extends AbstractSequence {

  /* Construct the sequence. */
  public A343146() {
    super(0);
  }

  // We use four bits per cell with 0 for the empty cell

  // Cell numbering:
  // +-+-+-+
  // |8|7|6|
  // +-+-+-+
  // |5|4|3|
  // +-+-+-+
  // |2|1|0|
  // +-+-+-+

  private static final int BITS_PER_CELL = 4;
  private static final long CELL_MASK = (1L << BITS_PER_CELL) - 1;
  protected static final long START_STATE = 0b0001_0010_0011_0100_0101_0110_0111_1000_0000L;
  private static final int[][] MOVE_DELTAS = {
    {1, 3},
    {-1, 1, 3},
    {-1, 3},
    {-3, 1, 3},
    {-3, -1, 1, 3},
    {-3, -1, 3},
    {-3, 1},
    {-3, -1, 1},
    {-3, -1}
  };

  private static int findEmpty(final long state) {
    int empty = 0;
    long mask = CELL_MASK;
    while ((state & mask) != 0) {
      mask <<= BITS_PER_CELL;
      ++empty;
    }
    assert empty <= 8;
    return empty;
  }

  protected final Map<Long, Integer> mStateToId = new HashMap<>();
  protected int[][] mTransitions = null;
  protected int mTargetId = 0;
  private Z[] mCounts;

  protected void init() {
    if (mTransitions == null) {
      // Precompute all possible transitions
      // Assign each possible state a unique id
      final Permutation perm = new Permutation(9);
      int[] p;
      while ((p = perm.next()) != null) {
        long s = 0;
        for (final int v : p) {
          s <<= BITS_PER_CELL;
          s += v;
        }
        mStateToId.put(s, mStateToId.size());
      }
      mTargetId = mStateToId.get(targetState());
      // Compute transition matrix between states
      mTransitions = new int[mStateToId.size()][];
      for (final Map.Entry<Long, Integer> e : mStateToId.entrySet()) {
        final long s = e.getKey();
        final int id = e.getValue();
        final int empty = findEmpty(s);
        mTransitions[id] = new int[MOVE_DELTAS[empty].length];
        for (int k = 0; k < MOVE_DELTAS[empty].length; ++k) {
          final long delta = MOVE_DELTAS[empty][k];
          final long dmask = CELL_MASK << (BITS_PER_CELL * (empty + delta));
          final long clear = s & ~dmask;
          final long set = s & dmask;
          final long shift = delta > 0 ? set >>> (BITS_PER_CELL * delta) : set << (BITS_PER_CELL * -delta);
          mTransitions[id][k] = mStateToId.get(clear + shift);
        }
      }
    }
  }

  protected long targetState() {
    return START_STATE;
  }

  private Z[] step(final Z[] counts) {
    final Z[] newCounts = new Z[counts.length];
    Arrays.fill(newCounts, Z.ZERO);
    for (int k = 0; k < counts.length; ++k) {
      final Z t = counts[k];
      for (final int j : mTransitions[k]) {
        newCounts[j] = newCounts[j].add(t);
      }
    }
    return newCounts;
  }

  @Override
  public Z next() {
    init();
    if (mCounts == null) {
      mCounts = new Z[mTransitions.length];
      Arrays.fill(mCounts, Z.ZERO);
      mCounts[mStateToId.get(START_STATE)] = Z.ONE;
    } else {
      mCounts = step(mCounts);
      mCounts = step(mCounts);
    }
    return mCounts[mTargetId];
  }
}
