package irvine.oeis.a155;
// Generated by gen_seq4.pl 2025-06-15.ack/polya at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a241.A241098;

/**
 * A155209 G.f.: A(x) = exp( Sum_{n&gt;=1} (4^n - 1)^n * x^n/n ), a power series in x with integer coefficients.
 * new A241098()
 * @author Georg Fischer
 */
public class A155209 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A155209() {
    super(0, "[1]", "x,B,x,/,int,exp", 0, 0, 1, 1, new A241098());
  }
}
