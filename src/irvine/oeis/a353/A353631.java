package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A353631 Arithmetic derivative of primorial base exp-function, reduced modulo 4, computed for odd numbers.
 * @author Georg Fischer
 */
public class A353631 extends LambdaSequence {

  private static final DirectSequence A353630 = new A353630();

  /** Construct the sequence. */
  public A353631() {
    super(0, n -> A353630.a(2 * n + 1));
  }
}
