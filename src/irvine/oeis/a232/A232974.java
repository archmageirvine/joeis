package irvine.oeis.a232;
// Generated by gen_seq4.pl 2025-06-25.ack/polyxa at 2025-06-25 23:22

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000629;

/**
 * A232974 Number of irreducible packed words of length n.
 * new A000629()
 * @author Georg Fischer
 */
public class A232974 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A232974() {
    super(0, "[1]", "1,1,x,B,/,-,1,+", 1, 0, 1, 1, new A000629());
  }
}
