package irvine.oeis.a214;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A214224 E.g.f. satisfies: A(x) = x/(1 - tan(A(x))).
 * x/(1-tan(A(x)))
 * @author Georg Fischer
 */
public class A214224 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A214224() {
    super(1, "[[0, 1]]", ";x;1;A;tan;-;/", 0, 1);
  }
}
