package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-04-22/lambdan at 2024-04-22 22:28

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A371234 E.g.f. satisfies A(x) = 1 - x^2*A(x)^4*log(1 - x*A(x)^2).
 * @author Georg Fischer
 */
public class A371234 extends LambdaSequence {

  /** Construct the sequence. */
  public A371234() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Functions.STIRLING1.z(n - 2L * k, k).abs(), (Functions.FACTORIAL.z(n - 2 * k)).multiply(Functions.FACTORIAL.z(2 * n - k + 1)))).multiply(Functions.FACTORIAL.z(n)).multiply(Functions.FACTORIAL.z(2 * n)).num());
  }
}
