package irvine.oeis.a363;
// Generated by gen_seq4.pl 2023-09-19/lambda at 2023-09-19 18:32

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A363987 a(n) = Sum_{k = 0..n} (-4)^(n-k)*binomial(n,k)*binomial(3*n+k,k)*binomial(2*k,k).
 * @author Georg Fischer
 */
public class A363987 extends LambdaSequence {

  /** Construct the sequence. */
  public A363987() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(-4).pow(n - k).multiply(Binomial.binomial(n, k)).multiply(Binomial.binomial(3L * n + k, k)).multiply(Binomial.binomial(2L * k, k))));
  }
}
