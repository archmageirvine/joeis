package irvine.oeis.a195;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A195136 a(n) = ((n+1)^(n-1) + (n-1)^(n-1))/2 for n&gt;=1.
 * @author Georg Fischer
 */
public class A195136 extends LambdaSequence {

  /** Construct the sequence. */
  public A195136() {
    super(1, n -> Integers.SINGLETON.sum(0, (n - 1) / 2, k -> Binomial.binomial(n - 1, 2L * k).multiply(Z.valueOf(n).pow(n - 2L * k - 1))));
  }
}
