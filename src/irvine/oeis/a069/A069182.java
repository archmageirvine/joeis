package irvine.oeis.a069;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A069182 a(1) = 2, a(2) = -32; a(n) = -16*a(n - 1) + 12*add(binomial(2*n - 2, 2*i)*a(i)*a(n - 1 - i), i = 1 .. n - 2).
 * @author Sean A. Irvine
 */
public class A069182 extends CachedSequence {

  /** Construct the sequence. */
  public A069182() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.TWO;
      }
      if (n == 2) {
        return Z.valueOf(-32);
      }
      Z sum = self.a(n - 1).multiply(-16);
      final long u = 2L * n - 2;
      for (int k = 1; k <= n - 2; ++k) {
        sum = sum.add(Binomial.binomial(u, 2L * k).multiply(self.a(k)).multiply(self.a(n - 1 - k)).multiply(12));
      }
      return sum;
    });
  }
}

