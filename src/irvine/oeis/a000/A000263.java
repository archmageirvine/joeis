package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A000263.
 * @author Sean A. Irvine
 */
public class A000263 implements Sequence {

  private static final int HIGH_PRECISION_POWER = 1024; // 2^10
  private static final Z POWER = Z.ONE.shiftLeft(HIGH_PRECISION_POWER);
  private static final Z POWER_BASE = POWER.sqrt();
  private static final double FUZZ = 0.1;
  private int mN = 2;
  private final DynamicArray<Z> mHighPrecisionConstants = new DynamicArray<>();

  private Z highPrecision(final int n) {
    Z r = mHighPrecisionConstants.get(n);
    if (r == null) {
      r = POWER.multiply(n).sqrt();
      mHighPrecisionConstants.set(n, r);
    }
    return r;
  }

  private boolean highPrecisionCheck(final int a, final int b, final long n) {
    return highPrecision(a + 1).add(highPrecision(b + 1))
      .compareTo(POWER_BASE.multiply(n)) <= 0;
  }

  private long count(final int n) {
    if (n > 46340) {
      throw new UnsupportedOperationException();
    }
    final int sn = n * n;
    final double[] x = new double[sn];
    for (int k = 0; k < sn; ++k) {
      x[k] = Math.sqrt(k + 1);
    }
    long c = 0;
    final double m = n;
    for (int a = 0; a < x.length; ++a) {
      for (int b = a + 1; b < x.length; ++b) {
        final double s = x[a] + x[b];
        if (s <= m + FUZZ && (s <= m - FUZZ || highPrecisionCheck(a, b, n))) {
          ++c;
        }
      }
    }
    return c;
  }

  @Override
  public Z next() {
    return Z.valueOf(count(++mN));
  }
}
