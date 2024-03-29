package irvine.oeis.a361;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A361717 a(n) = Sum_{k = 0..n-1} binomial(n-1,k)^2*binomial(n+k,k).
 * a(n) = sum(k=0,n-1,binom(n-1,k)^2*binom(n+k,k))
 * @author Georg Fischer
 */
public class A361717 extends LambdaSequence {

  /** Construct the sequence. */
  public A361717() {
    super(0, n -> Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n - 1, k).square().multiply(Binomial.binomial(n + k, k))));
  }
}
