package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A082399 a(1) = 1; thereafter, a(n) is the smallest nonnegative number such that the number Sum_{i=1..n} a(i)*10^(n-i) is divisible by n.
 * @author Sean A. Irvine
 */
public class A082399 extends CachedSequence {

  /** Construct the sequence. */
  public A082399() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      long r = 0;
      long t = 1;
      for (int k = n - 1; k > 0; --k) {
        final long u = self.a(k).mod(n);
        t *= 10;
        t %= n;
        r += (u * t) % n;
        r %= n;
      }
      return Z.valueOf((n - r) % n);
    });
  }
}
