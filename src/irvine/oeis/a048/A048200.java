package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048200.
 * @author Sean A. Irvine
 */
public class A048200 implements Sequence {

  // We represent states as a long, using 4-bits per element.
  // This means we can run out to n=16 (in theory).
  // Do a breadth first search looking for the target.
  // An exchange should not be followed by an exchange.

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
    //System.out.println(Long.toHexString(start) + " :: " + Long.toHexString(target));
    final TreeSet<Long> seen = new TreeSet<>();
    TreeSet<Long> todo = new TreeSet<>();
    TreeSet<Long> next = new TreeSet<>();
    todo.add(start);
    seen.add(start);
    int steps = 0;
    while (true) {
      ++steps;
      for (final long s : todo) {
        final long r = rotate(s);
        //System.out.println(Long.toHexString(s) + " -> " + Long.toHexString(r));
        if (r == target) {
          return Z.valueOf(steps);
        }
        if (seen.add(r)) {
          next.add(r);
        }
        final long x = exchange(s);
        //System.out.println(Long.toHexString(s) + " <> " + Long.toHexString(x));
        if (x == target) {
          return Z.valueOf(steps);
        }
        if (seen.add(x)) {
          next.add(x);
        }
      }
      todo = next;
      next = new TreeSet<>();
    }
  }
}
