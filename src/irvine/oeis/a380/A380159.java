package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-01-25.ack/lambdan at 2025-01-25 22:44

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A380159 Expansion of e.g.f. (exp(-3*x) + 3*x)^(1/3).
 * @author Georg Fischer
 */
public class A380159 extends LambdaSequence {

  /** Construct the sequence. */
  public A380159() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(3).pow(k).multiply(new Q(3L * k - 1).pow(n - k)).multiply(Binomial.binomial(new Q(1).divide(3), k)).divide(Functions.FACTORIAL.z(n - k)))).num());
  }
}
