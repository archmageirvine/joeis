package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-26.ack/polyx at 2025-03-26 22:40

import irvine.oeis.PolynomialFieldSequence;

/**
 * A381828 Expansion of ( (1/x) * Series_Reversion( x * ((1-x) * (1-x+x^2))^2 ) )^(1/2).
 * 
 * @author Georg Fischer
 */
public class A381828 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A381828() {
    super(0, "[[1]]", ",A,<1,catalan, 1,A,^2,<1,-,/", 1, 0);
  }
}
