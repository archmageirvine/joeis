package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A000347.
 * @author Sean A. Irvine
 */
public class A000347 implements Sequence {

  private static final int HIGH_PRECISION_POWER = 1024; // 2^10
  private static final Z POWER = Z.ONE.shiftLeft(HIGH_PRECISION_POWER);
  private static final Z POWER_BASE = Z.ONE.shiftLeft(HIGH_PRECISION_POWER / 2);
  private static final double FUZZ = 0.1;
  private int mN = 3;
  private final DynamicArray<Z> mHighPrecisionConstants = new DynamicArray<>();

  private Z highPrecision(final int n) {
    Z r = mHighPrecisionConstants.get(n);
    if (r == null) {
      r = POWER.multiply(n).sqrt();
      mHighPrecisionConstants.set(n, r);
    }
    return r;
  }

  private boolean highPrecisionCheck(final int a, final int b, final int c, final int d, final long n) {
    return highPrecision(a + 1)
      .add(highPrecision(b + 1))
      .add(highPrecision(c + 1))
      .add(highPrecision(d + 1))
      .compareTo(POWER_BASE.multiply(n)) <= 0;
  }

  private long count(final int n) {
    final int max = n * (n + 1);
    final double[] x = new double[max];
    for (int k = 0; k < max; ++k) {
      x[k] = Math.sqrt(k + 1);
    }
    long cnt = 0;
    final double m = n;
    for (int a = 0; a < x.length; ++a) {
      for (int b = a; b < x.length; ++b) {
        for (int c = b; c < x.length; ++c) {
          for (int d = c; d < x.length; ++d) {
            final double s = x[a] + x[b] + x[c] + x[d];
            if (s <= m + FUZZ && (s <= m - FUZZ || highPrecisionCheck(a, b, c, d, n))) {
              ++cnt;
            }
          }
        }
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    return Z.valueOf(count(++mN));
  }
}
