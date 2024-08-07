package irvine.oeis.a366;
// Generated by gen_seq4.pl 2024-03-06/lambdan at 2024-03-06 21:44

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A366751 Expansion of e.g.f. -log(1 - x^3 * (exp(x) - 1)).
 * @author Georg Fischer
 */
public class A366751 extends LambdaSequence {

  /** Construct the sequence. */
  public A366751() {
    super(0, n -> Rationals.SINGLETON.sum(1, n / 4, k -> new Q(Functions.FACTORIAL.z(k - 1).multiply(Functions.STIRLING2.z(n - 3L * k, k)), Functions.FACTORIAL.z(n - 3 * k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
