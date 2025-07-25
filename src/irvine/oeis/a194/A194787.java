package irvine.oeis.a194;
// Generated by gen_seq4.pl 2025-07-13.ack/polyxa at 2025-07-13 21:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A194787 E.g.f. A(x) = G(x)^G(x) where G(x) = 1 + x*G(x)^G(x) is the e.g.f. of A194786.
 * egf(new A194786())
 * @author Georg Fischer
 */
public class A194787 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A194787() {
    super(0, "[1]", "x,B,x,B,pow", 0, 1, 1, 1, egf(new A194786()));
  }
}
