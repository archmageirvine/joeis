package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-09-02.ack/lambdan at 2024-09-02 22:06

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A375660 Expansion of e.g.f. 1 / (1 - x * (exp(x) - 1))^2.
 * @author Georg Fischer
 */
public class A375660 extends LambdaSequence {

  /** Construct the sequence. */
  public A375660() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 2, k -> new Q(Functions.FACTORIAL.z(k + 1).multiply(Functions.STIRLING2.z(n - k, k)), Functions.FACTORIAL.z(n - k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
