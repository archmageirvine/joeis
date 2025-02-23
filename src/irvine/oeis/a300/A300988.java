package irvine.oeis.a300;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A300988 E.g.f. A(x) satisfies: [x^n] A(x)^(4*n) = (n + 3) * [x^(n-1)] A(x)^(4*n) for n&gt;=1.
 * exp(x*(A(x)-3*x*dif(A(x)))/(A(x)-4*x*dif(A(x))))
 * @author Georg Fischer
 */
public class A300988 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A300988() {
    super(0, "[[1]]", ";x;A;3;x;*;A;dif;*;-;*;A;4;x;*;A;dif;*;-;/;exp", 0, 1);
  }
}
