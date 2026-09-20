package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A086606 Triangle, read by rows, where the n-th row is the first n terms of the n-th self-convolution of the sequence formed by flattening this triangle.
 * @author Sean A. Irvine
 */
public class A086606 extends CachedSequence {

  /** Construct the sequence. */
  public A086606() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      final long t = (Functions.SQRT.l(8 * n + 1) + 1) / 2;
      final Series<Z> a = new AbstractInfiniteSeries<>() {
        @Override
        public Z coeff(final long m) {
          if (m == 0) {
            return Z.ONE;
          }
          return self.a(m);
        }
      };
      return SeriesRing.SZ.pow(a, t).coeff(n - Functions.TRIANGULAR.l(t - 1));
    });
  }
}


