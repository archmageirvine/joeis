package irvine.oeis.a186;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A186392 a(n) equals the least sum of the squares of the coefficients in ((1 + x^k)^3 + x^p)^n found at sufficiently large p for some fixed k&gt;0.
 * @author Georg Fischer
 */
public class A186392 extends LambdaSequence {

  /** Construct the sequence. */
  public A186392() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).square().multiply(Functions.FACTORIAL.z(6 * k)).divide(Functions.FACTORIAL.z(3 * k).square())));
  }
}
