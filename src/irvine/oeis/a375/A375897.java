package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-09-20.ack/lambdan at 2024-09-20 18:07

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A375897 E.g.f. satisfies A(x) = 1 / (2 - exp(x * A(x)^(1/2)))^2.
 * @author Georg Fischer
 */
public class A375897 extends LambdaSequence {

  /** Construct the sequence. */
  public A375897() {
    super(0, n -> (n <= 0) ? Z.ONE : Rationals.SINGLETON.sum(0, n, k -> new Q(Functions.FACTORIAL.z(n + k + 1).multiply(Functions.STIRLING2.z(n, k)), Functions.FACTORIAL.z(n + 2))).num().multiply(2));
  }
}
