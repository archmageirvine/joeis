package irvine.oeis.a300;
// Generated by gen_seq4.pl 2025-06-10.ack/polyxa at 2025-06-10 21:36

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000578;

/**
 * A300452 Logarithmic transform of the cubes A000578.
 * egf(new A000578())
 * @author Georg Fischer
 */
public class A300452 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A300452() {
    super(0, "[1]", "1,x,B,+,log", 0, 1, 1, 1, egf(new A000578()));
  }
}
