package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-12.ack/lambdan at 2025-03-12 21:05

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A381877 G.f. A(x) satisfies A(x) = C(x) / (1 - x*A(x))^4, where C(x) is the g.f. of A000108.
 * @author Georg Fischer
 */
public class A381877 extends LambdaSequence {

  /** Construct the sequence. */
  public A381877() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(n + k + 1, k)).multiply(Binomial.binomial(5 * n - 5 * k + 3, n - k)).divide(n + k + 1)).num());
  }
}
