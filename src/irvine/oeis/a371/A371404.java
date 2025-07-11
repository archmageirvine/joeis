package irvine.oeis.a371;
// Generated by gen_seq4.pl 2025-06-25.ack/polyx at 2025-06-25 23:22

import irvine.oeis.PolynomialFieldSequence;

/**
 * A371404 Expansion of (1/x) * Series_Reversion( x / ( (1+x) * (1+3*x)^2 ) ).
 * Expansion of (1/x) * Series_Reversion(x / ((1+x) * (1+3*x)^2)).7*x + 15*x^2 + 9*x^3 + 1
 * @author Georg Fischer
 */
public class A371404 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A371404() {
    super(0, "[1],[0,1],[1,7,15,9]", "p1,p2,/,rev,x,/", 1, 0);
  }
}
