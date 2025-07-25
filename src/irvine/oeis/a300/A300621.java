package irvine.oeis.a300;
// Generated by gen_seq4.pl 2025-07-17.ack/polyxa at 2025-07-18 00:03

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000040;

/**
 * A300621 Numerators of sequence whose exponential self-convolution yields sequence 1, 2, 3, 5, 7, 11, 13, ... (1 with primes).
 * new A000040()
 * @author Georg Fischer
 */
public class A300621 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A300621() {
    super(0, "[1]", "x,B,/n!,1,+,^1/2", 0, 1, 1, 1, new A000040());
  }
}
