package irvine.oeis.a338;
// Generated by gen_seq4.pl 2024-03-07/lambdan at 2024-03-07 22:01

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A338693 a(n) = Sum_{d|n} d^(d - n/d) * binomial(d, n/d).
 * @author Georg Fischer
 */
public class A338693 extends LambdaSequence {

  /** Construct the sequence. */
  public A338693() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(d).pow(d - n / d).multiply(Binomial.binomial(d, n / d))).num());
  }
}
