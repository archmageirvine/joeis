package irvine.oeis.a379;
// Generated by gen_seq4.pl 2024-12-30.ack/lambdan at 2024-12-30 19:33

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A379327 G.f. A(x) satisfies A(x) = sqrt( (1 + 2*x*A(x)^2) * (1 + 2*x*A(x)) ).
 * @author Georg Fischer
 */
public class A379327 extends LambdaSequence {

  /** Construct the sequence. */
  public A379327() {
    super(0, n -> new Q(Z.TWO.pow(n)).multiply(Rationals.SINGLETON.sum(0, n, k -> Binomial.binomial(new Q(n + k + 1, 2), k).multiply(Binomial.binomial(new Q(n + k + 1, 2), n - k)).divide(n + k + 1))).num());
  }
}
