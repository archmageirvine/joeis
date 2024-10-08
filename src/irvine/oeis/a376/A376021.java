package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-09-20.ack/lambdan at 2024-09-20 18:07

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A376021 a(n) = Sum_{d|n} d^(n/d - d) * binomial(n/d-1,d-1).
 * @author Georg Fischer
 */
public class A376021 extends LambdaSequence {

  /** Construct the sequence. */
  public A376021() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(d).pow(n / d - d).multiply(Binomial.binomial(n / d - 1, d - 1))).num());
  }
}
