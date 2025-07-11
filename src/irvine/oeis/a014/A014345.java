package irvine.oeis.a014;
// Generated by gen_seq4.pl 2025-06-25.ack/polyxa at 2025-06-25 23:22

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000040;

/**
 * A014345 Exponential convolution of primes with themselves.
 * new A000040()
 * @author Georg Fischer
 */
public class A014345 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A014345() {
    super(0, "[4]", "x,B,<-1,/n!,^2,*n!", 1, 0, 1, 1, new A000040());
  }
}
