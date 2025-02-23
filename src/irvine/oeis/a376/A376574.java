package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-02.ack/lambdan at 2024-10-02 22:45

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A376574 G.f. A(x) satisfies A(x) = 1/(1 - x*A(x)/(1 - x^3)).
 * @author Georg Fischer
 */
public class A376574 extends LambdaSequence {

  /** Construct the sequence. */
  public A376574() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Binomial.binomial(n - 2L * k - 1, k).multiply(Binomial.binomial(2 * (n - 3L * k), n - 3L * k)), Z.valueOf(n - 3L * k + 1))).num());
  }
}
