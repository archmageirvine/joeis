package irvine.oeis.a378;
// Generated by gen_seq4.pl 2024-12-08.ack/lambdan at 2024-12-08 22:31

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A378552 a(n) = Sum_{k=0..n} 9^k * binomial(n/3+k-1,k) * binomial(n-1,n-k).
 * @author Georg Fischer
 */
public class A378552 extends LambdaSequence {

  /** Construct the sequence. */
  public A378552() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(9).pow(k).multiply(Binomial.binomial(new Q(n, 3).add(k).subtract(1), k)).multiply(Binomial.binomial(n - 1, n - k))).num());
  }
}
