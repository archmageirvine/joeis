package irvine.oeis.a267;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A267310 a(n) is the numerator of Sum_{d|n} sigma(n/d)^d/d, where sigma is A000203.
 * @author Georg Fischer
 */
public class A267310 extends LambdaSequence {

  /** Construct the sequence. */
  public A267310() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(Functions.SIGMA1.z(n / d).pow(d), d)).num());
  }
}
