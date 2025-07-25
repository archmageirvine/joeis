package irvine.oeis.a162;
// Generated by gen_seq4.pl 2025-07-21.ack/polyxa at 2025-07-21 18:34

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a010.A010052;

/**
 * A162552 L.g.f.: log( Sum_{n&gt;=0} x^(n^2) ), the log of the characteristic function of the squares.
 * new A010052()
 * @author Georg Fischer
 */
public class A162552 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A162552() {
    super(1, "[1]", "x,B,log,n,*", 1, 0, 1, 1, new A010052());
  }
}
