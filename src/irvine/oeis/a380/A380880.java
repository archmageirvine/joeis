package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-02-10.ack/lambdan at 2025-02-10 21:26

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A380880 Expansion of e.g.f. (1/x) * Series_Reversion( x * exp(-3*x*exp(x)) ).
 * @author Georg Fischer
 */
public class A380880 extends LambdaSequence {

  /** Construct the sequence. */
  public A380880() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(k).pow(n - k).multiply(new Q(3L * n + 3).pow(k - 1)).multiply(Binomial.binomial(n, k))).multiply(3).num());
  }
}
