package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A000298 Number of partitions into non-integral powers.
 * @author Sean A. Irvine
 */
public class A000298 extends Sequence1 {

  private static final int HIGH_PRECISION_POWER = 1 << 10; // 2^10
  private static final Z POWER = Z.TWO.pow(HIGH_PRECISION_POWER);
  private static final Z POWER_BASE = POWER.sqrt();
  static final double FUZZ = 0.1;
  private int mN = 0;
  private final DynamicArray<Z> mHighPrecisionConstants = new DynamicArray<>();

  private Z highPrecision(final int n) {
    Z r = mHighPrecisionConstants.get(n);
    if (r == null) {
      r = POWER.multiply(n).sqrt();
      mHighPrecisionConstants.set(n, r);
    }
    return r;
  }

  protected boolean highPrecisionCheck(final int[] q, final int n) {
    Z s = Z.ZERO;
    for (final int v : q) {
      s = s.add(highPrecision(v));
    }
    return s.compareTo(POWER_BASE.multiply(n)) <= 0;
  }

  protected double sum(final double[] a) {
    double sum = 0;
    for (final double v : a) {
      sum += v;
    }
    return sum;
  }

  protected long count(final int[] q, final int n) {
    // q arranged with largest value first
    final double[] x = new double[q.length];
    for (int k = 0; k < q.length; ++k) {
      x[k] = Math.sqrt(q[k]);
    }
    final double s = sum(x);
    if (s - FUZZ > n) {
      return 0;
    }
    // For sums close to the limit perform a much higher precision test
    if (s + FUZZ >= n && !highPrecisionCheck(q, n)) {
      return 0;
    }
    long c = 1;
    final int last = q[q.length - 1];
    if (last > 1) {
      // Contributions from making array longer
      final double delta = n - s;
      final int nextElement = Math.min(last - 1, (int) (delta * delta));
      if (nextElement > 0) {
        final int[] newQ = new int[q.length + 1];
        System.arraycopy(q, 0, newQ, 0, q.length);
        newQ[newQ.length - 1] = nextElement;
        c += count(newQ, n);
      }
      // Contributions from reducing last element
      q[q.length - 1] = last - 1;
      c += count(q, n);
    }
    return c;
  }

  private long count(final int n) {
    final int[] q = {n * n};
    return count(q, n);
  }

  @Override
  public Z next() {
    return Z.valueOf(count(++mN));
  }
}
