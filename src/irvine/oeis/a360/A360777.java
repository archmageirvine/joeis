package irvine.oeis.a360;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.DynamicArray;
import irvine.util.string.StringUtils;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A360777 extends Sequence2 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 1;

  private Z polygonal(final long n, final long m) {
    return Z.valueOf(n).multiply(m - 1).subtract(2 * (m - 2)).multiply(m).divide2();
  }

  private Z isPolygonal(final long n, final Z m) {
    final Z s = m.multiply(n - 2).shiftLeft(3).add((n - 4) * (n - 4));
    if (!s.isSquare()) {
      return null;
    }
    final Z r = s.sqrt().add(n - 4).divide(2 * n - 4);
    return polygonal(mN, r.longValueExact()).equals(m) ? r : null;
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.NINE;
    }
    final HashSet<Z> seen = new HashSet<>();
    final DynamicArray<Z> sums = new DynamicArray<>();
    long m = 0;
    Z best = null;
    while (true) {
      final Z p = polygonal(mN, ++m);
      if (best != null && p.multiply2().compareTo(best) > 0) {
        return isPolygonal(mN, best);
      }
      seen.remove(p); // no longer need this entry
      for (int k = 0; k < sums.length(); ++k) {
        final Z t = sums.get(k).add(p);
        sums.set(k, t);
        final Z r = isPolygonal(mN, t);
        if (r != null && !seen.add(t)) {
          if (best == null || t.compareTo(best) < 0) {
            best = t;
            if (mVerbose) {
              StringUtils.message("n=" + mN + " solution <= " + r + " |seen|=" + seen.size());
            }
          }
        }
      }
      sums.set(sums.length(), p); // start a new sum
      if (mVerbose && m % 10000 == 0) {
        StringUtils.message("n=" + mN + " search complete to " + m);
      }
    }
  }
}
