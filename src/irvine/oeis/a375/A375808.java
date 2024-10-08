package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-09-16.ack/lambdan at 2024-09-16 19:36

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A375808 Expansion of e.g.f. 1/(1 + (log(1 - x^3))/x^2)^2.
 * @author Georg Fischer
 */
public class A375808 extends LambdaSequence {

  /** Construct the sequence. */
  public A375808() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Functions.FACTORIAL.z(n - 3 * k + 1).multiply(Functions.STIRLING1.z(n - 2L * k, n - 3L * k).abs()), Functions.FACTORIAL.z(n - 2 * k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
