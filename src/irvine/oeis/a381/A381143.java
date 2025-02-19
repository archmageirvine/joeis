package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-02-18.ack/polyx at 2025-02-18 23:09

import irvine.oeis.PolynomialFieldSequence;

/**
 * A381143 Expansion of e.g.f. (1/x) * Series_Reversion( x * exp(-x * cosh(x)) ).
 * A(x) = (1/x) * Series_Reversion(x * exp(-x * cosh(x))).
 * @author Georg Fischer
 */
public class A381143 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A381143() {
    super(0, "[[1],[0,-1]]", ",x,cosh,p1,*,exp,<1,rev,x,/", 1, 1);
  }
}
