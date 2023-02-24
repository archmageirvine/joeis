package irvine.oeis.a061;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061545 Number of pair-exchange / set-rotate sequences achieving the minimum length of A048200(n).
 * @author Sean A. Irvine
 */
public class A061545 extends Sequence1 {

  // Cf. A084200.

  private static final int BITS_PER_ELEMENT = 4;
  private static final long MASK1 = (1L << BITS_PER_ELEMENT) - 1;
  private static final long MASK2 = MASK1 << BITS_PER_ELEMENT;
  private static final long MASK12 = MASK1 | MASK2;

  private int mN = 0;

  private long rotate(final long s) {
    return (s >>> BITS_PER_ELEMENT) + ((s & MASK1) << (BITS_PER_ELEMENT * (mN - 1)));
  }

  private long exchange(final long s) {
    return (s & ~MASK12) + ((s & MASK2) >>> BITS_PER_ELEMENT) + ((s & MASK1) << BITS_PER_ELEMENT);
  }

  @Override
  public Z next() {
    if (++mN > 16) {
      throw new UnsupportedOperationException();
    }
    long start = 0;
    long target = 0;
    for (int k = 0; k < mN; ++k) {
      start <<= BITS_PER_ELEMENT;
      start += k;
      target <<= BITS_PER_ELEMENT;
      target += mN - k - 1;
    }
    if (start == target) {
      return Z.ZERO;
    }
    final TreeSet<Long> seen = new TreeSet<>();
    TreeMap<Long, Long> current = new TreeMap<>();
    TreeMap<Long, Long> next = new TreeMap<>();
    current.put(start, 1L);
    seen.add(start);
    long solutions = 0;
    while (true) {
      if (solutions > 0) {
        return Z.valueOf(solutions);
      }
      for (final Map.Entry<Long, Long> e : current.entrySet()) {
        final long s = e.getKey();
        final long v = e.getValue();
        final long r = rotate(s);
        if (r == target) {
          solutions += v;
        }
        if (!seen.contains(r)) {
          next.merge(r, v, Long::sum);
        }
        final long x = exchange(s);
        if (x == target) {
          solutions += v;
        }
        if (!seen.contains(x)) {
          next.merge(x, v, Long::sum);
        }
      }
      current = next;
      seen.addAll(next.keySet());
      next = new TreeMap<>();
    }
  }
}
