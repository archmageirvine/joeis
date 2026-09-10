package irvine.oeis.a295;
// manually 2026-09-08/lambdan at 2026-09-09 07: 46

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A295113 a(n) = (1/n)*Sum_{k=0..n-1} (8*k + 9)*A295112(k)^2.
 * @author Georg Fischer
 */
public class A295113 extends LambdaSequence {

  private static Z w(final long n) {
    return Integers.SINGLETON.sum(0, n / 2, k -> Binomial.binomial(n, 2 * k).multiply(Binomial.binomial(2 * k, k)).divide(2 * k - 1));
  }

  /** Construct the sequence. */
  public A295113() {
    super(1, n -> Integers.SINGLETON.sum(0, n - 1, k -> Z.valueOf(8 * k + 9).multiply(w(k).square())).divide(n));
  }
}
