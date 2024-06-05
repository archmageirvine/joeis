package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A000009 Expansion of Product_{m &gt;= 1} (1 + x^m); number of partitions of n into distinct parts; number of partitions of n into odd parts.
 * @author Sean A. Irvine
 */
public class A000009 extends CachedSequence {

  // Use method of Evangelos Georgiadis, Andrew V. Sutherland, Kiran S. Kedlaya.

  /** Construct the sequence. */
  public A000009() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      int k = 1;
      Z sum = Z.ZERO;
      int s;
      while ((s = k * k) <= n) {
        if ((k & 1) == 0) {
          sum = sum.subtract(self.a(n - s));
        } else {
          sum = sum.add(self.a(n - s));
        }
        ++k;
      }
      sum = sum.multiply2();
      final long nn = 2L * n;
      final long d = Functions.SQRT.l(1 + 24L * n);
      final long j0 = (d - 1) / 6;
      final long tj0 = 3 * j0;
      final long sigma;
      if (nn == j0 * (tj0 + 1) || nn == j0 * (tj0 - 1)) {
        sigma = (j0 & 1) == 0 ? 1 : -1;
      } else {
        final long j1 = (d + 1) / 6;
        final long tj1 = 3 * j1;
        if (nn == j1 * (tj1 + 1) || nn == j1 * (tj1 - 1)) {
          sigma = (j1 & 1) == 0 ? 1 : -1;
        } else {
          sigma = 0;
        }
      }
      //System.out.println("sigma=" + sigma + " j0=" + j0 + " j1=" + j1);
      return sum.add(sigma);
    });
  }
}

