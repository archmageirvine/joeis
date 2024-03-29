package irvine.oeis.a101;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 13:33

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A101878 Expansion of -LambertW(LambertW(-x))/x.
 * a(n) = sum(k=0,n,(k+1)^k*(n+1)^(n-k-1)*binom(n,k));
 * @author Georg Fischer
 */
public class A101878 extends LambdaSequence {

  /** Construct the sequence. */
  public A101878() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(k + 1).pow(k).multiply(new Q(n + 1).pow(n - k - 1)).multiply(Binomial.binomial(n, k))).num());
  }
}
