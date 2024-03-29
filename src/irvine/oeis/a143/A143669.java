package irvine.oeis.a143;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A143669 a(n) = binomial((n+1)^2, n) / (n+1)^2.
 * @author Georg Fischer
 */
public class A143669 extends LambdaSequence {

  /** Construct the sequence. */
  public A143669() {
    super(0, n -> Binomial.binomial((long) (n + 1) * (n + 1), n).divide(Z.valueOf(n + 1).square()));
  }
}
