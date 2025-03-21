package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A378840 G.f. A(x) satisfies A(x) = ( 1 + x * A(x)^(4/3) * (1 + A(x)^(1/3)) )^3.
 * @author Georg Fischer
 */
public class A378840 extends LambdaSequence {

  /** Construct the sequence. */
  public A378840() {
    super(0, n -> new Q(3).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(n, k)).multiply(Binomial.binomial(4L * n + k + 3, n)).divide(4L * n + k + 3))).num());
  }
}
