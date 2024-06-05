package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.DynamicArray;

/**
 * A000148 Number of partitions into non-integral powers.
 * @author Sean A. Irvine
 */
public class A000148 extends Sequence2 {

  private static final double THIRD = 1.0 / 3.0;
  private static final int HIGH_PRECISION_POWER = 729; // 3^6
  private static final Z POWER = Z.THREE.pow(HIGH_PRECISION_POWER);
  private static final Z POWER_BASE = POWER.square().root(3);
  private static final double FUZZ = 0.1;
  private long mN = 1;
  private final DynamicArray<Z> mHighPrecisionConstants = new DynamicArray<>();

  private Z highPrecision(final int n) {
    Z r = mHighPrecisionConstants.get(n);
    if (r == null) {
      r = POWER.multiply(n).square().root(3);
      mHighPrecisionConstants.set(n, r);
    }
    return r;
  }

  private boolean highPrecisionCheck(final int a, final int b, final long n) {
    return highPrecision(a + 1).add(highPrecision(b + 1))
      .compareTo(POWER_BASE.multiply(n)) <= 0;
  }

  private long count(final long n) {
    final int max = Functions.SQRT.i(n * n * n);
    final double[] x = new double[max];
    for (int k = 0; k < max; ++k) {
      x[k] = Math.pow((k + 1) * (k + 1), THIRD);
    }
    long c = 0;
    final double m = n;
    for (int a = 0; a < x.length; ++a) {
      for (int b = a; b < x.length; ++b) {
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
