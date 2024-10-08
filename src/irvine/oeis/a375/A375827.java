package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-09-20.ack/lambdan at 2024-09-20 18:07

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A375827 E.g.f. satisfies A(x) = exp(x^2 * (exp(x*A(x)) - 1)).
 * @author Georg Fischer
 */
public class A375827 extends LambdaSequence {

  /** Construct the sequence. */
  public A375827() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Z.valueOf(n - 2L * k + 1)).pow(k - 1).multiply(Functions.STIRLING2.z(n - 2L * k, k)).divide(Functions.FACTORIAL.z(n - 2 * k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
