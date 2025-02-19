package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-10-28.ack/lambdan at 2024-10-28 19:20

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A377359 E.g.f. satisfies A(x) = ( 1 - log(1 - x*A(x))/A(x) )^3.
 * @author Georg Fischer
 */
public class A377359 extends LambdaSequence {

  /** Construct the sequence. */
  public A377359() {
    super(0, n -> Rationals.SINGLETON.sum(0, (3 * n + 3) / 4, k -> new Q(Functions.FACTORIAL.z(3 * n - 3 * k + 2), Functions.FACTORIAL.z(3 * n - 4 * k + 3)).multiply(Functions.STIRLING1.z(n, k).abs())).multiply(3).num());
  }
}
