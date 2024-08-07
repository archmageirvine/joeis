package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-07-20/lambdan at 2024-07-20 00:09

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A374676 a(n) = Sum_{k=0..n} binomial(n+k-1,n) * binomial(n+k,n)^2.
 * @author Georg Fischer
 */
public class A374676 extends LambdaSequence {

  /** Construct the sequence. */
  public A374676() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n + k - 1, n).multiply(Binomial.binomial(n + k, n).square())));
  }
}
