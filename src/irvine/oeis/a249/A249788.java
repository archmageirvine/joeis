package irvine.oeis.a249;
// Generated by gen_seq4.pl 2025-07-11.ack/polyx at 2025-07-11 21:53

import irvine.oeis.PolynomialFieldSequence;

/**
 * A249788 E.g.f. A(x) satisfies: (A(x)^2 - 4*x)^5 = (2 - A(x)^5)^2.
 * @author Georg Fischer
 */
public class A249788 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A249788() {
    super(0, "[1],[1,5],[1,-5]", "1,5,p1,^2/5,p2,^2/5,-,4,/,rev,*,+,^1/5", 0, 1);
  }
}
