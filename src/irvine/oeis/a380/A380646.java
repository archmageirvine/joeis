package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-02-10.ack/lambdan at 2025-02-10 21:26

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A380646 Expansion of e.g.f. (1/x) * Series_Reversion( x * exp(-2*x)/(1 + x)^2 ).
 * @author Georg Fischer
 */
public class A380646 extends LambdaSequence {

  /** Construct the sequence. */
  public A380646() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(2L * n + 2).pow(k - 1).multiply(Binomial.binomial(2L * n + 2, n - k)).divide(Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n).multiply(2)).num());
  }
}
