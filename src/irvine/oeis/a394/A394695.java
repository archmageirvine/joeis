package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394695 Number of social networks of n persons in which the statement "Most of my friends have more friends than I have" is true for a majority of the persons.
 * @author Sean A. Irvine
 */
public class A394695 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final long k = (long) mN * (mN - 1) / 2;
    if (k >= 63) {
      throw new UnsupportedOperationException("n too large for 64-bit implementation");
    }

    final long lim = 1L << k;

    // Build edge list
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

    final int[] di = new int[mN];   // degrees
    final long[] adj = new long[mN]; // adjacency bitsets

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

      // Row-wise majority check variant
      final int[] nI = new int[mN];
      for (int i = 0; i < mN; ++i) {
        int countPos = 0;
        long bits = adj[i];
        while (bits != 0) {
          final int j = Long.numberOfTrailingZeros(bits);
          if (di[j] - di[i] > 0) { // dij[i][j] - di[i] > 0
            ++countPos;
          }
          bits &= bits - 1;
        }
        nI[i] = countPos > Long.bitCount(adj[i]) / 2 ? 1 : 0;
      }

      int sum = 0;
      for (final int x : nI) {
        sum += x;
      }
      if (sum > mN / 2) {
        ++count;
      }
    }

    return Z.valueOf(count);
  }
}
