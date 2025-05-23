package irvine.oeis.a228;
// Generated by gen_seq4.pl 2025-05-08.ack/polyxa at 2025-05-08 13:52

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a223.A223026;

/**
 * A228712 G.f. A(x) satisfies: 1/A(x)^4 + 16*x*A(x)^4 = 1/A(x^2)^2 + 4*x*A(x^2)^2.
 * new A223026()
 * @author Georg Fischer
 */
public class A228712 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A228712() {
    super(0, "[1],[0,64],[0,32]", "x,S,^4,x,S,^8,p1,-,sqrt,-,p2,/,^1/4", 1, 0, 1, 1, new A223026());
  }
}
