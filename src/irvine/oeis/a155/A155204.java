package irvine.oeis.a155;
// Generated by gen_seq4.pl 2025-06-15.ack/polya at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a202.A202989;

/**
 * A155204 G.f.: A(x) = exp( Sum_{n&gt;=1} (3^n + 1)^n * x^n/n ), a power series in x with integer coefficients.
 * new A202989()
 * @author Georg Fischer
 */
public class A155204 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A155204() {
    super(0, "[1]", "x,B,x,/,int,exp", 0, 0, 1, 1, new A202989());
  }
}
