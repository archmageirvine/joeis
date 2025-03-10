package irvine.oeis.a192;
// Generated by gen_seq4.pl 2025-01-31.ack/polyz at 2025-01-31 23:19

import irvine.oeis.PolynomialFieldSequence;

/**
 * A192007 E.g.f. sin(cos(x)-1) (even part).
 * E.g.f.: sin(cos(x)-1)
 * @author Georg Fischer
 */
public class A192007 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A192007() {
    super(0, "[[1]]", ",x,cos,1,-,sin", 0, 1, 0, 2);
  }
}
