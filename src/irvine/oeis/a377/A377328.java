package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-10-28.ack/lambdan at 2024-10-28 19:20

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A377328 E.g.f. satisfies A(x) = 1 + A(x)^2 * (exp(x*A(x)^3) - 1).
 * @author Georg Fischer
 */
public class A377328 extends LambdaSequence {

  /** Construct the sequence. */
  public A377328() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Functions.FACTORIAL.z(3 * n + 2 * k), Functions.FACTORIAL.z(3 * n + k + 1)).multiply(Functions.STIRLING2.z(n, k))).num());
  }
}
