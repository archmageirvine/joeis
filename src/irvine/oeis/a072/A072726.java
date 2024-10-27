package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A072726 Numerator of the rationals &gt;= 1 whose continued fractions consist of only even terms, in ascending order by the sum of the continued fraction terms and descending by lowest order continued fraction terms to highest.
 * @author Sean A. Irvine
 */
public class A072726 extends CachedSequence {

  /** Construct the sequence. */
  public A072726() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      if (n == Integer.highestOneBit(n)) {
        return Z.valueOf(2 * Integer.numberOfTrailingZeros(n) + 2);
      }
      if (n - 1 == Integer.highestOneBit(n - 1)) {
        return Z.valueOf(4 * Integer.numberOfTrailingZeros(n - 1) + 1);
      }
      // Determine n = 2^k + 2^j + m, 2^k > 2^ j > m >= 0
      int v = 1;
      int k = 0;
      while (v < n) {
        v <<= 1;
        ++k;
      }
      --k;
      v >>>= 1;
      final int m = n - v;
      int j = k;
      while (v > m) {
        v >>>= 1;
        --j;
      }
      return self.a(m).multiply(2L * (k - j)).add(self.a(m - v));
    });
  }
}
