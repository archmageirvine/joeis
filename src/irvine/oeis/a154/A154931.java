package irvine.oeis.a154;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A154931 Third column of A154921.
 * E.g.f.: <code>1/2*x^2/(2-exp(x))</code>.
 * @author Georg Fischer
 */
public class A154931 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A154931() {
    super(2, "[1]", "1,2,/,x,^2,*,2,x,exp,-,/", 0, 1);
  }
}
