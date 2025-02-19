package irvine.oeis.a306;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A306090 G.f. A(x) satisfies: (1 + A(x))^A(x) = (1 + x)^x ; this sequence gives the numerators of the coefficients of x^n in g.f. A(x).
 * A = (A + x*log(1 + x)/log(1 + A))/2
 * @author Georg Fischer
 */
public class A306090 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A306090() {
    super(1, "[[0,-1],[1, 1]]", ",A,p1,log,<1, 1,A,+,log,/,+, 2,/", 0, 0);
  }
}
