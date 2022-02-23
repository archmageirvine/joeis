package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A054762 a(n) is a cube mod a(i) for all i &lt; n.
 * @author Sean A. Irvine
 */
public class A054762 extends MemorySequence {

  private  boolean test(final long u, final long m) {
    for (long k = 0; k < m; ++k) {
      if (LongUtils.modPow(k, 3, m) == u) {
        return true;
      }
    }
    return false;
  }

  private boolean isCubes(final Z n) {
    final long t = n.longValueExact();
    for (final Z a : this) {
      final long m = a.longValueExact();
      if (!test(t % m, m)) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ONE;
    }
    Z t = get(size() - 1);
    while (true) {
      t = t.add(1);
      if (isCubes(t)) {
        return t;
      }
    }
  }
}
