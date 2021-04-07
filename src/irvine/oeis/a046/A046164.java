package irvine.oeis.a046;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A046164.
 * @author Sean A. Irvine
 */
public class A046164 implements Sequence {

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
  private static final long START_STATE = 0b0001_0010_0011_0100_0101_0110_0111_1000_0000L;
  private static final long TARGET_STATE = 0b1000_0111_0110_0101_0100_0011_0010_0001_0000L;
//  private static final long START_STATE = 0b0001_0010_0011_0100_0000_0101_0110_0111_1000L;
//  private static final long TARGET_STATE = 0b1000_0111_0110_0101_0000_0100_0011_0010_0001L;
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

  private final Map<Long, Integer> mStateToId = new HashMap<>();
  private final int[][] mTransitions;
  private long mCount = 0;
  private final int mTargetId;
  {
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
    mTargetId = mStateToId.get(TARGET_STATE);
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
  private final boolean[] mUsed = new boolean[mStateToId.size()];

  private static int findEmpty(final long state) {
    int empty = 0;
    long mask = CELL_MASK;
    while ((state & mask) != 0) {
      mask <<= BITS_PER_CELL;
      ++empty;
    }
    return empty;
  }

  private void search(final int id, final int stepsRemaining) {
    if (stepsRemaining == 0) {
      if (id == mTargetId) {
        ++mCount;
      }
      return;
    }
    for (final int newId : mTransitions[id]) {
      if (!mUsed[newId]) {
        mUsed[newId] = true;
        search(newId, stepsRemaining - 1);
        mUsed[newId] = false;
      }
    }
  }

  private int mN = 26;

  @Override
  public Z next() {
    mCount = 0;
    mN += 2;
    search(mStateToId.get(START_STATE), mN);
    return Z.valueOf(mCount);
  }
}
