package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-03-22/lambdan at 2024-03-24 22:44

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A371329 E.g.f. satisfies A(x) = (exp(x/(1 - A(x))) - 1)/(1 - A(x)).
 * @author Georg Fischer
 */
public class A371329 extends LambdaSequence {

  /** Construct the sequence. */
  public A371329() {
    super(0, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(Functions.FACTORIAL.z(n + 2 * k - 2), Functions.FACTORIAL.z(n + k - 1)).multiply(Functions.STIRLING2.z(n, k))).num());
  }
}
