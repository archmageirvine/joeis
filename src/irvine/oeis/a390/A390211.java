package irvine.oeis.a390;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390211 Canonical coin systems; numbers k where the positions of 1-bits in the binary expansion of k give the coin denominations of a canonical coin system.
 * @author Sean A. Irvine
 */
public class A390211 extends Sequence1 {

  private long mN = -1;

  private static boolean isCanonical(final List<Long> coins) {
    if (coins.size() < 2) {
      return true;
    }
    final long x = coins.get(0);
    final long y = coins.get(1);
    final long sum = x + y;
    if (sum > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    final int limit = (int) sum;
    final int[] optimal = new int[limit];
    final int[] greedy = new int[limit];
    for (int t = 1; t < limit; ++t) {
      int best = Integer.MAX_VALUE;
      for (final long c : coins) {
        if (c <= t) {
          final int cand = 1 + optimal[(int) (t - c)];
          if (cand < best) {
            best = cand;
          }
        }
      }
      optimal[t] = best;
    }
    for (int t = 1; t < limit; ++t) {
      long coin = 0L;
      for (final long c : coins) {
        if (c <= t) {
          coin = c;
          break;
        }
      }
      if (coin == 0L) {
        return false;
      }
      greedy[t] = 1 + greedy[(int) (t - coin)];
    }
    for (int t = 0; t < limit; ++t) {
      if (greedy[t] != optimal[t]) {
        return false;
      }
    }
    return true;
  }

  private static List<Long> coinsFromBinary(long k, long x) {
    final ArrayList<Long> out = new ArrayList<>();
    while (x != 0) {
      if ((x & 1L) == 1L) {
        out.add(k);
      }
      k++;
      x >>>= 1;
    }
    return out;
  }

  private static boolean is(final long x) {
    if (x == 1) {
      return true;
    }
    if ((x & 1) == 0) {
      return false;
    }
    final List<Long> coins = coinsFromBinary(1, x);
    Collections.reverse(coins);
    return isCanonical(coins);
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
