package irvine.oeis.a295;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A295623 a(n) = n! * [x^n] exp(n*x*exp(x)).
 * @author Georg Fischer
 */
public class A295623 extends LambdaSequence {

  /** Construct the sequence. */
  public A295623() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(n).pow(k).multiply(Z.valueOf(k).pow(n - k)).multiply(Binomial.binomial(n, k))));
  }
}
