package irvine.oeis.a145;
// Generated by gen_seq4.pl 2025-02-13.ack/polyx at 2025-02-13 23:28

import irvine.oeis.PolynomialFieldSequence;

/**
 * A145162 G.f. A(x) satisfies A(x/A(x)^4) = 1/(1-x).
 * x*A(1-1/A(x))^4
 * @author Georg Fischer
 */
public class A145162 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A145162() {
    super(0, "[[1]]", ", 1, 1,x,A,^4,/,rev,-,/", 0, 0);
  }
}
