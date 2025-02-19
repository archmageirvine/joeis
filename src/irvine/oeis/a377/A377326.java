package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-10-28.ack/lambdan at 2024-10-28 19:20

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A377326 E.g.f. satisfies A(x) = 1 + (exp(x*A(x)) - 1)/A(x).
 * @author Georg Fischer
 */
public class A377326 extends LambdaSequence {

  /** Construct the sequence. */
  public A377326() {
    super(0, n -> Rationals.SINGLETON.sum(0, (n + 1) / 2, k -> new Q(Functions.FACTORIAL.z(n - k), Functions.FACTORIAL.z(n - 2 * k + 1)).multiply(Functions.STIRLING2.z(n, k))).num());
  }
}
