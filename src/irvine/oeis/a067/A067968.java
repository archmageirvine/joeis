package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A067968 Number of binary arrangements on n X n array without adjacent three 1's.
 * @author Sean A. Irvine
 */
public class A067968 extends Sequence1 {

  private int mN = 0;

  private boolean isNoThreeAdjacent(final Pair<Long, Long> bits, final long c) {
    // We already know there are not three consecutive bits in a column anywhere
    final long b = bits.right();
    if ((b & c) == 0) {
      return true; // New column has no bits in same positions as previous column
    }
    final long a = bits.left();
    if ((a & b & c) != 0) {
      return false; // three bits in a row
    }

    // Check for three bits not in a straight line
    final long bAndC = b & c;
    final long bOrC = b | c;
    for (long bit = 1; bit <= c; bit <<= 1) {
      if ((bAndC & bit) != 0) {
        final long f = bit << 1;
        if ((bOrC & f) != 0) {
          return false;
        }
        if (bit > 1) {
          final long g = bit >>> 1;
          if ((bOrC & g) != 0) {
            return false;
          }
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN > 64) {
      throw new UnsupportedOperationException();
    }
    final ArrayList<Long> patterns = new ArrayList<>();
    for (long i = 0; i < (1L << mN); ++i) {
      long j = i;
      while (j != 0 && (j & 7) != 7) {
        j >>>= 1;
      }
      if ((j & 7) != 7) {
        patterns.add(i);
      }
    }
    final long[] p = new long[patterns.size()];
    for (int k = 0; k < p.length; ++k) {
      p[k] = patterns.get(k);
    }
    Map<Pair<Long, Long>, Z> v = new HashMap<>();
    for (final long t : p) {
      v.put(new Pair<>(0L, t), Z.ONE);
    }
    for (int i = 1; i < mN; ++i) {
      final Map<Pair<Long, Long>, Z> w = new HashMap<>();
      for (final Map.Entry<Pair<Long, Long>, Z> e : v.entrySet()) {
        final Pair<Long, Long> bits = e.getKey();
        final Z cnt = e.getValue();
        for (final long k : p) {
          if (isNoThreeAdjacent(bits, k)) {
            final Pair<Long, Long> s = new Pair<>(bits.right(), k);
            w.merge(s, cnt, Z::add);
          }
        }
      }
      v = w;
    }
    Z sum = Z.ZERO;
    for (final Z z : v.values()) {
      sum = sum.add(z);
    }
    return sum;
  }

}
