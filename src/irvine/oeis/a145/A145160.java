package irvine.oeis.a145;
// Generated by gen_seq4.pl 2025-02-08.ack/poly at 2025-02-08 09:46

import irvine.oeis.PolynomialFieldSequence;

/**
 * A145160 G.f. A(x) satisfies A(x/A(x)^3) = 1/(1-x).
 * @author Georg Fischer
 */
public class A145160 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A145160() {
    super(0, "[[1]]", ",1,1,x,A,^3,/,rev,-,/");
  }
}
