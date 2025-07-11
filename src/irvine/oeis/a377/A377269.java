package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-10-28.ack/lambdan at 2024-10-28 19:20

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A377269 G.f. A(x) satisfies A(x) = (1 - 9*x*A(x))^(2/3).
 * @author Georg Fischer
 */
public class A377269 extends LambdaSequence {

  /** Construct the sequence. */
  public A377269() {
    super(0, n -> Binomial.binomial(new Q(n - 5, 3), n).multiply(Z.NINE.pow(n)).divide(n + 1).num());
  }
}
