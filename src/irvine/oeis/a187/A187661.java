package irvine.oeis.a187;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A187661 Binomial convolution of the (signless) central Stirling numbers of the first kind and the central Stirling numbers of the second kind.
 * a(n) = sum(k=0,n,binom(n,k)*abs(stirl(2*k,k,1)*stirl(2*(n-k),n-k,2)));
 * @author Georg Fischer
 */
public class A187661 extends LambdaSequence {

  /** Construct the sequence. */
  public A187661() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Functions.STIRLING1.z(2L * k, k).multiply(Functions.STIRLING2.z(2L * (n - k), n - k)).abs())));
  }
}
