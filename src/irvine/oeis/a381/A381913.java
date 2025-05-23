package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-12.ack/lambdan at 2025-03-12 21:05

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A381913 Expansion of (1/x) * Series_Reversion( x * (1-x)^3 / B(x) ), where B(x) is the g.f. of A001764.
 * @author Georg Fischer
 */
public class A381913 extends LambdaSequence {

  /** Construct the sequence. */
  public A381913() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(n + 3 * k + 1, k)).multiply(Binomial.binomial(4 * n - k + 2, n - k)).divide(n + 3 * k + 1)).num());
  }
}
