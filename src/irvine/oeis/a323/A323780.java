package irvine.oeis.a323;
// Generated by gen_seq4.pl 2024-07-02/lambdan at 2024-07-03 22:28

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A323780 a(n) = denominator of Sum_{d|n} (tau(d)/sigma(d)) where tau(k) = the number of the divisors of k (A000005) and sigma(k) = the sum of the divisors of k (A000203).
 * @author Georg Fischer
 */
public class A323780 extends LambdaSequence {

  /** Construct the sequence. */
  public A323780() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(Functions.TAU.z(d), Functions.SIGMA1.z(d))).den());
  }
}
