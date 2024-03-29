package irvine.oeis.a108;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A108079 a(n) = Sum_{i=0..n} C(2n+i,n+i).
 * @author Georg Fischer
 */
public class A108079 extends LambdaSequence {

  /** Construct the sequence. */
  public A108079() {
    super(0, n -> Binomial.binomial(3L * n + 1, n + 1).subtract(Binomial.binomial(2L * n, n - 1)));
  }
}
