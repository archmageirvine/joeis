package irvine.oeis.a389;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.util.string.StringUtils;

/**
 * A081418.
 * @author Sean A. Irvine
 */
public class A389766 extends AbstractSequence implements DirectSequence {

  // todo possibly it would be faster to also set bits in mAttacked where mColumnCounts are already 2
  // todo is there a way to exploit, say, left-right symmetry
  // todo reduce memory by spinning file to disk
  // todo need crt to handle larger sizes
  // todo replace State with a single long

  // We pack state information into a single long
  // The lower n bits indicate cells which are forbidden for placement on the next row
  // The next 2n bits are 2-bit counters with the number of kings in each column
  // This should enable computation as far as n=21 (since 3*21=63 < 64), but a lot
  // of memory is still required to hold all the states.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 7;

  /** Construct the sequence. */
  public A389766() {
    super(8);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    if (3 * n > Long.SIZE) {
      throw new UnsupportedOperationException();
    }

    final long rowMask = (1L << n) - 1;
    final int[] attackMasks = new int[n];
    for (int k = 0; k < n; ++k) {
      attackMasks[k] = (int) (((0b111L << k) >>> 1) & rowMask);
    }

    // Precompute possible arrangements for a particular row
    final int[] forbidden = new int[(n - 1) * (n - 2) / 2];
    final int[] blocked = new int[forbidden.length];
    final long[] colAdd = new long[forbidden.length];
    final long[] colMask = new long[forbidden.length];
    for (int firstKing = 0, k = 0; firstKing < n - 2; ++firstKing) {
      for (int secondKing = firstKing + 2; secondKing < n; ++secondKing, ++k) {
        forbidden[k] = (1 << firstKing) | (1 << secondKing);
        blocked[k] = attackMasks[firstKing] | attackMasks[secondKing];
        colAdd[k] = (1L << (2 * firstKing)) + (1L << (2 * secondKing));
        colMask[k] = (3L << (2 * firstKing)) + (3L << (2 * secondKing));
      }
    }

    Map<Long, Long> states = Collections.singletonMap(0L, 1L);
    for (int row = 0; row < n; ++row) {
      final HashMap<Long, Long> newStates = new HashMap<>(states.size() * (row < 8 ? 3 : 1)); // Try to guess the peak in size
      for (final Map.Entry<Long, Long> e : states.entrySet()) {
        final long state = e.getKey();
        final int attacked = (int) (state & rowMask);
        final long cnt = e.getValue();
        for (int k = 0; k < forbidden.length; ++k) {
          if ((attacked & forbidden[k]) == 0) {
            final long colCounts = state >>> n;
            final long u = (colCounts & colMask[k]) + colAdd[k];
            if ((u & (u >>> 1)) == 0) { // Checks no column count is now 3
              newStates.merge(((colCounts + colAdd[k]) << n) + blocked[k], cnt, Long::sum);
            }
          }
        }
      }
      states = newStates;
      if (mVerbose) {
        StringUtils.message("n=" + n + " completed row " + (row + 1) + " number of states " + states.size());
      }
    }
    Z sum = Z.ZERO;
    for (final long v : states.values()) {
      sum = sum.add(v);
    }
    return sum;
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
