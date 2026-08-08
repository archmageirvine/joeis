package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A086226 Number of permutations of length n containing exactly one occurrence of the pattern 1-32.
 * @author Sean A. Irvine
 */
public class A086226 extends CachedSequence {

  /** Construct the sequence. */
  public A086226() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      Z sum = self.a(n - 1);
      for (long k = 1; k < n; ++k) {
        sum = sum.add(Binomial.binomial(n, k).multiply(self.a(k)).add(Binomial.binomial(n - 1, k - 1).multiply(Functions.BELL.z(k))));
      }
      return sum;
    });
  }
}

