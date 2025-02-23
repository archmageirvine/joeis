package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-01-27.ack/lambdan at 2025-01-27 21:28

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A380425 E.g.f. A(x) satisfies A(x) = exp( 2 * x * A(x)^(1/2) * exp(x * A(x)^(1/2)) ).
 * @author Georg Fischer
 */
public class A380425 extends LambdaSequence {

  /** Construct the sequence. */
  public A380425() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(k).pow(n - k).multiply(new Q(n + 2).pow(k - 1)).multiply(Binomial.binomial(n, k))).multiply(2).num());
  }
}
