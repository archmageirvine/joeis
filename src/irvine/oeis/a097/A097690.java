package irvine.oeis.a097;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A097690 Numerators of the continued fraction n-1/(n-1/...) [n times].
 * @author Georg Fischer
 */
public class A097690 extends LambdaSequence {

  /** Construct the sequence. */
  public A097690() {
    super(1, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(n - 2).pow(k).multiply(Binomial.binomial(n + 1 + k, 2L * k + 1))));
  }
}
