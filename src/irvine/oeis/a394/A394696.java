package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394696 Number of social networks of n persons in which the statement "My friends have on average more friends than I have" is true for a majority of the persons.
 * @author Sean A. Irvine
 */
public class A394696 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final long k = (long) mN * (mN - 1) / 2;
    if (k >= 63) {
      throw new UnsupportedOperationException("n too large for 64-bit implementation");
    }
    final long lim = 1L << k;
    // Edge list
    final int[] eu = new int[(int) k];
    final int[] ev = new int[(int) k];
    int pos = 0;
    for (int i = 1; i < mN; ++i) {
      for (int j = 0; j < i; ++j) {
        eu[pos] = i;
        ev[pos] = j;
        ++pos;
      }
    }

    final int[] di = new int[mN];
    final long[] adj = new long[mN];
    long count = 0;
    long prevGray = 0;
    for (long mask = 0; mask < lim; ++mask) {
      final long gray = mask ^ (mask >> 1);
      if (mask != 0) {
        final long diff = prevGray ^ gray;
        final int bit = Long.numberOfTrailingZeros(diff);
        final int u = eu[bit];
        final int v = ev[bit];
        final boolean add = ((gray >>> bit) & 1L) != 0;
        if (add) {
          adj[u] |= 1L << v;
          adj[v] |= 1L << u;
          ++di[u];
          ++di[v];
        } else {
          adj[u] &= ~(1L << v);
          adj[v] &= ~(1L << u);
          --di[u];
          --di[v];
        }
      }

      prevGray = gray;

      // Skip if any isolated vertex
      boolean ok = true;
      for (int i = 0; i < mN; ++i) {
        if (di[i] == 0) {
          ok = false;
          break;
        }
      }
      if (!ok) {
        continue;
      }

      // Compute dij
      final long[] dij = new long[mN];
      for (int j = 0; j < mN; ++j) {
        long sum = 0;
        long bits = adj[j];
        while (bits != 0) {
          final int i = Long.numberOfTrailingZeros(bits);
          sum += di[i];
          bits &= bits - 1;
        }
        dij[j] = sum;
      }

      // Count friendship condition
      int countPos = 0;
      for (int i = 0; i < mN; ++i) {
        if (dij[i] > (long) di[i] * di[i]) {
          ++countPos;
        }
      }

      if (countPos > mN / 2) {
        ++count;
      }
    }

    return Z.valueOf(count);
  }
}
