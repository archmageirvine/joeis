package irvine.oeis.a371;
// Generated by gen_seq4.pl 2025-06-25.ack/polyx at 2025-06-25 23:22

import irvine.oeis.PolynomialFieldSequence;

/**
 * A371426 Expansion of (1/x) * Series_Reversion( x / ((1+x)^2 - x^3) ).
 * @author Georg Fischer
 */
public class A371426 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A371426() {
    super(0, "[1],[0,1],[1,2,1,-1]", "p1,p2,/,rev,x,/", 1, 0);
  }
}
