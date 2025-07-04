package irvine.oeis.a228;
// Generated by gen_seq4.pl 2025-05-08.ack/polyxa at 2025-05-08 13:52

import irvine.oeis.PolynomialFieldSequence;

/**
 * A228928 G.f. A(x) satisfies: 1/A(x)^8 + 64*x*A(x)^8 = 1/A(x^2)^4 + 8*x*A(x^2)^4.
 * new A228927()
 * @author Georg Fischer
 */
public class A228928 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A228928() {
    super(0, "[1],[0,256],[0,128]", "x,S,^8,x,S,^16,p1,-,sqrt,-,p2,/,^1/8", 1, 0, 1, 1, new A228927());
  }
}
