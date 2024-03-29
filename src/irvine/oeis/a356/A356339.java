package irvine.oeis.a356;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 11:10

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A356339 a(n) = Sum_{k=1..n} binomial(2*n, n-k) * sigma_2(k).
 * a(n) = sum(k=1,n,binom(2*n,n-k) * sigma(k,2));
 * @author Georg Fischer
 */
public class A356339 extends LambdaSequence {

  /** Construct the sequence. */
  public A356339() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Binomial.binomial(2L * n, n - k).multiply(Jaguar.factor(k).sigma(2))));
  }
}
