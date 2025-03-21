package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A378327 a(n) = Sum_{k=0..n} binomial(n,k) * binomial(n*k,k) / ((n-1)*k + 1).
 * @author Georg Fischer
 */
public class A378327 extends LambdaSequence {

  /** Construct the sequence. */
  public A378327() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(n, k)).multiply(Binomial.binomial((long) n * k, k)).divide(new Q(n - 1).multiply(k).add(1))).num());
  }
}
