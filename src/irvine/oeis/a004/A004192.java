package irvine.oeis.a004;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000142;

/**
 * A004192.
 * @author Sean A. Irvine
 */
public class A004192 extends A000142 {

  // Factorial numbers can end in trailing zeros.  We enqueue two numbers for
  // every one we take off, to allow for ordering.  We also will detect if we
  // every produce numbers out of order.

  private final TreeMap<Z, Integer> mPriority = new TreeMap<>();
  private Z mPrev = Z.ZERO;

  private void add(final Z n) {
    final Integer c = mPriority.get(n);
    if (c == null) {
      mPriority.put(n, 1);
    } else {
      mPriority.remove(n);
      mPriority.put(n, c + 1);
    }
  }

  private Z get() {
    final Map.Entry<Z, Integer> e = mPriority.pollFirstEntry();
    if (e.getValue() > 1) {
      mPriority.put(e.getKey(), e.getValue() - 1);
    }
    return e.getKey();
  }

  @Override
  public Z next() {
    add(ZUtils.reverse(super.next()));
    add(ZUtils.reverse(super.next()));
    final Z fr = get();
    if (fr.compareTo(mPrev) < 0) {
      throw new UnsupportedOperationException("Out of order: " + fr);
    }
    mPrev = fr;
    return fr;
  }
}
