package irvine.oeis.a390;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390419 Triangle read by rows: T(n,k) is the number of ways to place k non-attacking kings in each row of an n X n board, 0 &lt;= k &lt;= floor((n+1)/4) + [n=1].
 * @author Sean A. Irvine
 */
public class A390419 extends Sequence1 {

  // This could be made to support larger n by replacing Long with BitSet

  private int mN = 0;
  private int mM = 0;

  private boolean allowed(final Long state, final int pos) {
    return (state & (1L << pos)) == 0;
  }

  private void placeKings(final int[] kings, final int k, final int start, final int n, final long prevMask, final Z count, final Map<Long, Z> nextStates) {
    if (k == kings.length) {
      // All kings placed, construct the mask and update the count
      long mask = 0L;
      for (final int king : kings) {
        mask |= (0b111L << king) >>> 1;
      }
      nextStates.merge(mask, count, Z::add);
      return;
    }

    // maxPos efficiency to ensure sufficient space for remaining kings
    final int maxPos = n - 2 * (kings.length - k) + 2;
    for (int pos = start; pos < maxPos; ++pos) {
      if (allowed(prevMask, pos)) {
        kings[k] = pos;
        placeKings(kings, k + 1, pos + 2, n, prevMask, count, nextStates);
      }
    }
  }

  /**
   * Compute the number of arrangements for board size <code>n</code> and <code>k</code> kings.
   * @param n board size
   * @param k number of kings
   * @return number of arrangements
   */
  public Z t(final int n, final int k) {
    if (k == 0 || n == 0) {
      return Z.ONE;
    }
    if (2 * k - 1 > n) {
      return Z.ZERO; // Impossible to fit k kings
    }
    Map<Long, Z> states = Collections.singletonMap(0L, Z.ONE);
    final int[] kings = new int[k]; // Reusable space for positions of kings
    for (int row = 0; row < n; ++row) {
      final Map<Long, Z> nextStates = new HashMap<>();
      for (final Map.Entry<Long, Z> e : states.entrySet()) {
        final long prev = e.getKey();
        final Z count = e.getValue();
        placeKings(kings, 0, 0, n, prev, count, nextStates);
      }
      states = nextStates;
    }
    return Functions.SUM.z(states.values());
  }

  @Override
  public Z next() {
    if (++mM > (mN + 1) / 4 + (mN == 1 ? 1 : 0)) {
      if (++mN >= Long.SIZE) {
        throw new UnsupportedOperationException();
      }
      mM = 0;
    }
    return t(mN, mM);
  }
}
