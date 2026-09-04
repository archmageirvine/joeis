package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A086449 a(0) = 1, a(2n+1) = a(n), a(2n) = a(n) + a(n-1) + ... + a(n-2^m) + ... where a(n) = 0 for n &lt; 0.
 * @author Sean A. Irvine
 */
public class A086449 extends CachedSequence {

  /** Construct the sequence. */
  public A086449() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      final long m = n / 2;
      Z sum = self.a(m);
      if ((n & 1) == 0) {
        for (long k = 1; k <= m; k <<= 1) {
          sum = sum.add(self.a(m - k));
        }
      }
      return sum;
    });
  }
}

