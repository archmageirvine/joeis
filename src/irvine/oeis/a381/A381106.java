package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-02-16.ack/lambdan at 2025-02-16 22:50

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A381106 Expansion of e.g.f. -log(1-x)^3 * (exp(x) - 1) / 6.
 * @author Georg Fischer
 */
public class A381106 extends LambdaSequence {

  /** Construct the sequence. */
  public A381106() {
    super(0, n -> Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n, k).multiply((Functions.STIRLING1.z(k, 3)).abs())));
  }
}
