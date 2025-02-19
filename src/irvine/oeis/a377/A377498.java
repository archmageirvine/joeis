package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-11-01.ack/lambdan at 2024-11-01 22:07

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A377498 E.g.f. satisfies A(x) = 1/(1 - A(x)^3 * (exp(x*A(x)^3) - 1)).
 * @author Georg Fischer
 */
public class A377498 extends LambdaSequence {

  /** Construct the sequence. */
  public A377498() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Functions.FACTORIAL.z(3 * n + 4 * k)).divide(Functions.FACTORIAL.z(3 * n + 3 * k + 1)).multiply(Functions.STIRLING2.z(n, k))).num());
  }
}
