package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-03-06/lambdan at 2024-03-06 21:44

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A367180 E.g.f. satisfies A(x) = 1 + (exp(x*A(x)^2) - 1)/A(x).
 * @author Georg Fischer
 */
public class A367180 extends LambdaSequence {

  /** Construct the sequence. */
  public A367180() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Functions.STIRLING2.z(n, k).multiply(Functions.FACTORIAL.z(2 * n - k)), Functions.FACTORIAL.z(2 * n - 2 * k + 1))).num());
  }
}
