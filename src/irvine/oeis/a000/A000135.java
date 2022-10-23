package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A000135 Number of partitions into non-integral powers.
 * @author Sean A. Irvine
 */
public class A000135 extends Sequence1 {

  private static final double THIRD = 1.0 / 3.0;
  private static final int HIGH_PRECISION_POWER = 729; // 3^6
  private static final Z POWER = Z.THREE.pow(HIGH_PRECISION_POWER);
  private static final Z POWER_BASE = POWER.square().root(3);
  private static final double FUZZ = 0.1;
  private long mN = 0;
  private final DynamicArray<Z> mHighPrecisionConstants = new DynamicArray<>();

  private Z highPrecision(final int n) {
    Z r = mHighPrecisionConstants.get(n);
    if (r == null) {
      r = POWER.multiply(n).square().root(3);
      mHighPrecisionConstants.set(n, r);
    }
    return r;
  }

  private boolean highPrecisionCheck(final Z k, final long n, final int max) {
    final Z limit = POWER_BASE.multiply(n);
    Z s = Z.ZERO;
    for (int p = max - 1; p >= 0; --p) {
      if (k.testBit(p)) {
        s = s.add(highPrecision(p + 1));
      }
    }
    return s.compareTo(limit) <= 0;
  }

  private long count(final long n) {
    final int max = (int) LongUtils.sqrt(n * n * n);
    final double[] x = new double[max];
    for (int k = 0; k < max; ++k) {
      x[k] = Math.pow((k + 1) * (k + 1), THIRD);
    }
    long c = 0;
    final Z lim = Z.ONE.shiftLeft(max);
    final double m = n;
    Z k = Z.ONE;
    while (k.compareTo(lim) < 0) {
      double s = 0;
      int p = max - 1;
      while (p >= 0 && s <= m) {
        if (k.testBit(p)) {
          s += x[p];
        }
        --p;
      }
      if (s <= m + FUZZ && (s <= m - FUZZ || highPrecisionCheck(k, n, max))) {
        ++c;
        k = k.add(1);
      } else {
        final Z h = Z.ONE.shiftLeft(p + 1);
        k = k.add(h);
        k = k.andNot(h.subtract(Z.ONE));
      }
    }
    return c;
  }

  @Override
  public Z next() {
    return Z.valueOf(count(++mN));
  }
}
