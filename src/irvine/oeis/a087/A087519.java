package irvine.oeis.a087;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A087518 Number of arrangements of 1..n^2 in n X n array with exactly one local maximum.
 * @author Sean A. Irvine
 */
public class A087519 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  /*
   * Transform a subset mask by one of the 8 symmetries of the square.
   */
  private long transform(final long mask, final int symmetry) {
    final int n = mN;
    long result = 0;
    long remaining = mask;

    while (remaining != 0) {
      final int v = Long.numberOfTrailingZeros(remaining);
      remaining &= remaining - 1;

      final int r = v / n;
      final int c = v % n;

      final int rr;
      final int cc;

      switch (symmetry) {
        case 0:
          rr = r;
          cc = c;
          break;
        case 1:
          rr = r;
          cc = n - 1 - c;
          break;
        case 2:
          rr = n - 1 - r;
          cc = c;
          break;
        case 3:
          rr = n - 1 - r;
          cc = n - 1 - c;
          break;
        case 4:
          rr = c;
          cc = r;
          break;
        case 5:
          rr = c;
          cc = n - 1 - r;
          break;
        case 6:
          rr = n - 1 - c;
          cc = r;
          break;
        default:
          rr = n - 1 - c;
          cc = n - 1 - r;
          break;
      }

      result |= 1L << (rr * n + cc);
    }

    return result;
  }

  /*
   * Return the canonical representative of a subset under the dihedral symmetry group of the square.
   */
  private long canonical(final long mask) {
    long best = mask;
    for (int s = 1; s < 8; ++s) {
      final long t = transform(mask, s);
      if (t < best) {
        best = t;
      }
    }
    return best;
  }

  /*
   * Return the distinct symmetric images of a mask.
   * A symmetric subset can have fewer than 8 images.
   */
  private long[] orbit(final long mask) {
    final long[] images = new long[8];
    int count = 0;

    for (int s = 0; s < 8; ++s) {
      final long t = transform(mask, s);
      boolean found = false;
      for (int j = 0; j < count; ++j) {
        if (images[j] == t) {
          found = true;
          break;
        }
      }
      if (!found) {
        images[count++] = t;
      }
    }

    final long[] result = new long[count];
    System.arraycopy(images, 0, result, 0, count);
    return result;
  }

  /**
   * Test whether the vertices in mask induce a connected graph.
   * The empty graph is considered connected for this purpose.
   */
  private boolean connected(final long mask, final LongDynamicLongArray adj) {
    if (mask == 0) {
      return true;
    }
    long reached = Long.lowestOneBit(mask);
    long frontier = reached;
    while (frontier != 0) {
      long neighbours = 0;
      long remaining = frontier;
      while (remaining != 0) {
        final int v = Long.numberOfTrailingZeros(remaining);
        neighbours |= adj.get(v);
        remaining &= remaining - 1;
      }
      frontier = neighbours & mask & ~reached;
      reached |= frontier;
    }
    return reached == mask;
  }

  @Override
  public Z next() {
    ++mN;
    final int m = mN * mN;
    if (m >= 63) {
      throw new UnsupportedOperationException("Too many cells");
    }
    final long full = (1L << m) - 1;

    // Adjacency mask for each grid vertex.
    final LongDynamicLongArray adj = new LongDynamicLongArray();
    for (int r = 0; r < mN; ++r) {
      for (int c = 0; c < mN; ++c) {
        final int v = r * mN + c;
        if (r > 0) {
          adj.set(v, adj.get(v) | 1L << (v - mN));
        }
        if (r + 1 < mN) {
          adj.set(v, adj.get(v) | 1L << (v + mN));
        }
        if (c > 0) {
          adj.set(v, adj.get(v) | 1L << (v - 1));
        }
        if (c + 1 < mN) {
          adj.set(v, adj.get(v) | 1L << (v + 1));
        }
      }
    }

    /*
     * Store one representative per symmetry orbit.
     * The value is the number of growth orderings
     * of that particular representative.
     */
    HashMap<Long, Z> currentDp = new HashMap<>();
    for (int v = 0; v < m; ++v) {
      final long mask = 1L << v;
      currentDp.put(canonical(mask), Z.ONE);
    }

    // Grow subsets one vertex at a time.
    for (int k = 1; k < m; ++k) {
      if (mVerbose) {
        StringUtils.message(mN + " growing " + k + "/" + m + " size=" + currentDp.size());
      }

      final HashMap<Long, Z> nextDp = new HashMap<>();
      for (final Map.Entry<Long, Z> e : currentDp.entrySet()) {
        final long representative = e.getKey();
        final Z ways = e.getValue();
        // Consider every distinct subset in this orbit.
        for (final long mask : orbit(representative)) {
          // Find all vertices adjacent to the current subset.
          long candidates = 0;
          long remaining = mask;
          while (remaining != 0) {
            final int v = Long.numberOfTrailingZeros(remaining);
            candidates |= adj.get(v);
            remaining &= remaining - 1;
          }
          candidates &= ~mask;
          while (candidates != 0) {
            final int v = Long.numberOfTrailingZeros(candidates);
            final long nextMask = mask | (1L << v);
            candidates &= candidates - 1;
            if (canonical(nextMask) == nextMask && connected(full ^ nextMask, adj)) {
              nextDp.merge(nextMask, ways, Z::add);
            }
          }
        }
      }
      currentDp = nextDp;
    }
    return currentDp.get(full);
  }
}
