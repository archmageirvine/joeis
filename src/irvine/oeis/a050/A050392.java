package irvine.oeis.a050;
// Generated by gen_seq4.pl 2025-06-25.ack/polya at 2025-06-25 23:22

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000010;

/**
 * A050392 Exponential reversion of Euler totient function A000010.
 * new A000010()
 * @author Georg Fischer
 */
public class A050392 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A050392() {
    super(1, "[0,1]", "x,B,/n!,rev,*n!", 0, 0, 1, 1, new A000010());
  }
}
