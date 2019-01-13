package irvine.oeis.a000;

import java.util.Arrays;

/**
 * A000333.
 * @author Sean A. Irvine
 */
public class A000333 extends A000298 {

  @Override
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
    // Contributions from making array longer
    final double delta = n - s;
    final int nextElement = Math.min(last, (int) (delta * delta));
    if (nextElement > 0) {
      final int[] newQ = Arrays.copyOf(q, q.length + 1);
      newQ[newQ.length - 1] = nextElement;
      c += count(newQ, n);
    }
    // Contributions from reducing last element
    if (last > 1) {
      q[q.length - 1] = last - 1;
      c += count(q, n);
    }
    return c;
  }
}
