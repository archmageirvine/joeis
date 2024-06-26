package irvine.oeis.a129;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A129949 a(n) = n! - binomial(n,3).
 * a(n)=n!-binom(n,3)
 * @author Georg Fischer
 */
public class A129949 extends LambdaSequence {

  /** Construct the sequence. */
  public A129949() {
    super(0, n -> Functions.FACTORIAL.z(n).subtract(Binomial.binomial(n, 3)));
  }
}
