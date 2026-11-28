package irvine.oeis.a211;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A211877 Number of nonzero idempotent n X n matrices over GF(4).
 * @author Gregory Morse
 */
public class A211877 extends LambdaSequence {

  private static Z idempotents(final long n) {
    Z sum = Z.ZERO;
    for (long k = 1; k <= n; ++k) {
      // Choose the image and a complementary kernel.
      sum = sum.add(Binomial.gaussianBinomial(n, k, 4).shiftLeft(2 * k * (n - k)));
    }
    return sum;
  }

  /** Construct the sequence. */
  public A211877() {
    super(1, A211877::idempotents);
  }
}
