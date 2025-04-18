package irvine.oeis.a343;
// Generated by gen_seq4.pl 2024-12-01.ack/lambdan at 2024-12-01 23:03

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A343876 a(n) = n * Sum_{d|n} d^mu(d).
 * @author Georg Fischer
 */
public class A343876 extends LambdaSequence {

  /** Construct the sequence. */
  public A343876() {
    super(1, n -> new Q(n).multiply(Rationals.SINGLETON.sumdiv(n, d -> new Q(d).pow(Functions.MOEBIUS.i(d)))).num());
  }
}
