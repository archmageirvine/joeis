package irvine.oeis.a367;
// Generated by gen_seq4.pl serexp/lambdan at 2024-01-22 15:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A367640 G.f. A(x) satisfies A(x) = (1 + x)^2 + x*A(x)^3 / (1 + x)^2.
 * @author Georg Fischer
 */
public class A367640 extends LambdaSequence {

  /** Construct the sequence. */
  public A367640() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(2L * k + 2, n - k).multiply(Binomial.binomial(3L * k, k)).divide(2L * k + 1)));
  }
}
