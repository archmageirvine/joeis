package irvine.oeis.a204;
// Generated by gen_seq4.pl 2024-11-27.ack/lambdan at 2024-11-27 22:04

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A204292 Binomial(n, d(n)), where d(n) = A000005(n) is the number of divisors of n.
 * @author Georg Fischer
 */
public class A204292 extends LambdaSequence {

  /** Construct the sequence. */
  public A204292() {
    super(1, n -> Binomial.binomial(n, Functions.TAU.i(n)));
  }
}
