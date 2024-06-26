package irvine.oeis.a070;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A070032 Integer part of sigma(n)/phi(n).
 * a(n)=floor(sigma(n,1)/eulerphi(n))
 * @author Georg Fischer
 */
public class A070032 extends LambdaSequence {

  /** Construct the sequence. */
  public A070032() {
    super(1, n -> Jaguar.factor(n).sigma(1).divide(Functions.PHI.l(n)));
  }
}
