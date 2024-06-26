package irvine.oeis.a124;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A124102 a(n) = C(2n,n)*Bell(n).
 * a(n)=binom(2*n, n)*bell(n)
 * @author Georg Fischer
 */
public class A124102 extends LambdaSequence {

  /** Construct the sequence. */
  public A124102() {
    super(0, n -> Binomial.binomial(2L * n, n).multiply(Functions.BELL.z(n)));
  }
}
