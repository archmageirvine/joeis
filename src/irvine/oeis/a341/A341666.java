package irvine.oeis.a341;
// Generated by gen_seq4.pl 2025-04-20.ack/filter at 2025-04-20 22:06

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A341666 Primes p such that p^6 - 1 has 384 divisors.
 * @author Georg Fischer
 */
public class A341666 extends FilterSequence {

  /** Construct the sequence. */
  public A341666() {
    super(1, new A000040(), p -> Functions.SIGMA.i(0, p.pow(6).subtract(1)) == 384);
  }
}
