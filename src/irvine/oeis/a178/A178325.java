package irvine.oeis.a178;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A178325 G.f.: A(x) = Sum_{n&gt;=0} x^n/(1-x)^(n^2).
 * a(n) = sum(k=0,n,binom((n-k)^2 + k-1,k))
 * @author Georg Fischer
 */
public class A178325 extends LambdaSequence {

  /** Construct the sequence. */
  public A178325() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial((long) (n - k) * (n - k) + k - 1, k)));
  }
}
