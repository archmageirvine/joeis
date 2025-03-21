package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-01-01.ack/lambdan at 2025-01-01 23:25

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A379690 Expansion of e.g.f. (1/x) * Series_Reversion( x * (1 - x*exp(2*x)) ).
 * @author Georg Fischer
 */
public class A379690 extends LambdaSequence {

  /** Construct the sequence. */
  public A379690() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(2L * n - 2L * k).pow(k).multiply(Functions.FACTORIAL.z(2 * n - k)).divide(new Q(Functions.FACTORIAL.z(k)).multiply(Functions.FACTORIAL.z(n - k)))).divide(n + 1).num());
  }
}
