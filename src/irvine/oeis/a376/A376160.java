package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-09-26.ack/lambdan at 2024-09-26 23:06

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A376160 G.f. satisfies A(x) = 1 / ((1-x)^3 - x*A(x)^3).
 * @author Georg Fischer
 */
public class A376160 extends LambdaSequence {

  /** Construct the sequence. */
  public A376160() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(n + 11L * k + 2, n - k).multiply(Binomial.binomial(4L * k, k)), Z.valueOf(3L * k + 1))).num());
  }
}
