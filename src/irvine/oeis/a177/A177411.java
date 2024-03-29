package irvine.oeis.a177;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A177411 a(n) = binomial((n+1)*2^(n+1), n)/(n+1).
 * a(n)=binom((n+1)*2^(n+1),n)/(n+1)
 * @author Georg Fischer
 */
public class A177411 extends LambdaSequence {

  /** Construct the sequence. */
  public A177411() {
    super(0, n -> Binomial.binomial(Z.valueOf(n + 1).shiftLeft(n + 1), n).divide(Z.valueOf(n + 1)));
  }
}
