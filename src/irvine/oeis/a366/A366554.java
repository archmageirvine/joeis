package irvine.oeis.a366;
// Generated by gen_seq4.pl serexp/lambdan at 2024-01-22 15:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A366554 G.f. A(x) satisfies A(x) = 1 + x + x^4*A(x)^2.
 * @author Georg Fischer
 */
public class A366554 extends LambdaSequence {

  /** Construct the sequence. */
  public A366554() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 4, k -> Binomial.binomial(k + 1, n - 4L * k).multiply(Binomial.binomial(2L * k, k)).divide(k + 1)));
  }
}
