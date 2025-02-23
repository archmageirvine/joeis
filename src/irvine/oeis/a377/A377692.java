package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-11-21.ack/lambdan at 2024-11-21 23:03

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A377692 E.g.f. satisfies A(x) = (1 - log(1 - x) * A(x))^2.
 * @author Georg Fischer
 */
public class A377692 extends LambdaSequence {

  /** Construct the sequence. */
  public A377692() {
    super(0, n -> (n == 0) ? Z.ONE : Rationals.SINGLETON.sum(0, n, k -> new Q(Functions.FACTORIAL.z(2 * k + 1), Functions.FACTORIAL.z(k + 2)).multiply((Functions.STIRLING1.z(n, k)).abs())).multiply(2).num());
  }
}
