package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-03-06/lambdan at 2024-03-06 21:44

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A367159 E.g.f. satisfies A(x) = 1 - A(x)^2 * log(1 - x*A(x)).
 * @author Georg Fischer
 */
public class A367159 extends LambdaSequence {

  /** Construct the sequence. */
  public A367159() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Functions.STIRLING1.z(n, k).abs().multiply(Functions.FACTORIAL.z(n + 2 * k)), Functions.FACTORIAL.z(n + k + 1))).num());
  }
}
