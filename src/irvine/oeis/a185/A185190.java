package irvine.oeis.a185;
// Generated by gen_seq4.pl 2025-06-10.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A185190 E.g.f. satisfies: A(x) = x + arcsinh(A(x))^2.
 * E.g.f.: <code>reverse(x-asinh(x)^2)</code>.
 * @author Georg Fischer
 */
public class A185190 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A185190() {
    super(1, "[1]", "x,x,asinh,^2,-,rev", 0, 1);
  }
}
